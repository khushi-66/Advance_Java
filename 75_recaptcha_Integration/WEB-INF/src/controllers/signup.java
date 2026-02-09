package controllers;

import java.io.File;
import java.io.IOException;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.net.URL;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modals.user;
import utils.util;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpSession;
import utils.emailSender;
import utils.emailTemplate;
@WebServlet("/signup.do")
public class signup extends HttpServlet {
  
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        System.out.println("signup servlet enters.....");
          FileItem tmp = null;
          String captcha=null;
      ServletContext context= getServletContext();
        String uploadpath = context.getRealPath("/WEB-INF/uploads");
      boolean flag=false;
      String nextPage="signup.html";
     if (ServletFileUpload.isMultipartContent(req)) {
        
         user u = new user();
          DiskFileItemFactory dfif = new DiskFileItemFactory();
         ServletFileUpload sfu = new ServletFileUpload(dfif);
              try {
            List<FileItem>fileitems = sfu.parseRequest(req);
             for(FileItem fileitem : fileitems){
               
               if (fileitem.isFormField()) {
                  String fieldName = fileitem.getFieldName();
                  String value = fileitem.getString();
 
                  if (fieldName.equals("name")) {
                     u.setname(value);

                  } else if (fieldName.equals("email")) {
                     u.setemail(value);
                  } else if(fieldName.equals("psb")) {
                     u.setpassword(value);
                  }else if(fieldName.equals("phone")){
                     u.setphone(value);
                  }else if(fieldName.equals("g-recaptcha-response")){
                          captcha=value;
                  }
                      } 
                      
                      else {
                      tmp = fileitem;
               }
            } //for ends

 Boolean success=false;
        //recaptcha integration .............................
     System.out.println(" captcha response  :  "+captcha);
    String secretkey=System.getenv("captchakey");
        String apiReqURL = "https://www.google.com/recaptcha/api/siteverify?secret="+secretkey+"&response="+captcha;
        URL url = new URL(apiReqURL);
          HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
         con.connect();
      DataOutputStream dos = new DataOutputStream(con.getOutputStream());
           dos.flush();
        dos.close();
        int responseCode = con.getResponseCode();
       if(responseCode == HttpURLConnection.HTTP_OK) {
            InputStream is = con.getInputStream();
            JsonReader jr = Json.createReader(is);
            JsonObject jo = jr.readObject();
              System.out.println("json capcha object :  "+jo );
               success =jo.getBoolean("success");
            System.out.println("success : "+success);}
           //recaptcha integration end.....................................
      
      


            if(u.getphone() != null &&  success == true){
           u.setpic(u.getemail()+File.separatorChar + tmp.getName());
            String verificationCode=util.generateVerificationCode();
                  u.setVerificationCode(verificationCode);
            
            
            if (u.saveuser()) {
                       //create email folder...............
                File folderpath=new File(uploadpath,u.getemail());
                   folderpath.mkdir();
                     
                   //profile image write in user email folder.......
                   File file=new File(folderpath,tmp.getName());
                   tmp.write(file);

                   //create product folder.................
                   File productfolder =new File(folderpath,"products");
                   productfolder.mkdir();
                   
                   //send verification mail...............
                   emailSender.sendEmail(u.getemail(), emailTemplate.getWLCmail(u.getname(),u.getemail(),verificationCode),"Email Regarding account activation.....");
               nextPage="signup_success.html";
               flag=true;
            }
                   }
                 } 
         catch (FileUploadException e) {
         } catch (Exception e) {
               e.printStackTrace();
         }
      
          
          req.setAttribute("success",flag);
         req.getRequestDispatcher(nextPage).forward(req, res);
      }

   }
}
