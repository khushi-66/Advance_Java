package controllers;

import java.io.File;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modals.user;
import utils.util;

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
      FileItem tmp = null;
      ServletContext context= getServletContext();
        String uploadpath = context.getRealPath("/WEB-INF/uploads");
      boolean flag=false;
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
 // System.out.println("fieldName : "+fieldName+ "    value : "+value);
                  if (fieldName.equals("name")) {
                     u.setname(value);

                  } else if (fieldName.equals("email")) {
                     u.setemail(value);
                  } else if(fieldName.equals("psb")) {
                     u.setpassword(value);
                  }
                      } 
                      
                      else {
                      tmp = fileitem;
               }
            } //for ends


          u.setpic(u.getemail()+File.separatorChar + tmp.getName());
            String verificationCode=util.generateVerificationCode();
                  u.setVerificationCode(verificationCode);
            
            flag=u.saveuser();
            System.out.println( "is value added ? : "+flag);
            if (flag) {
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
            }
         } catch (FileUploadException e) {
         } catch (Exception e) {
                  
         }
         
          System.out.println(flag);
         req.getRequestDispatcher("signup_success.html").forward(req, res);
      }

   }
}
