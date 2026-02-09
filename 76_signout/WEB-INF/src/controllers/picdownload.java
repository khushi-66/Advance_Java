package controllers;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import modals.user;
import javax.servlet.ServletContext;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import java.io.IOException;
@WebServlet("/picdownload.do")
public class picdownload extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        System.out.println("you entered in pic downloadservlet.........");
        HttpSession session=req.getSession();

        res.setContentType("image/png");
        // res.setContentType("application/octet-stream");
        // res.setHeader("Content-Disposition","attachment;filename=\"image.png\"");
        user u=(user) session.getAttribute("user");
        ServletContext context=getServletContext();
             String downloadpath=null;
             String path=null;
             String what=req.getParameter("what");
             if(what.equals("user_pic")){
                    downloadpath="WEB-INF/uploads/"+u.getpic();
             } 
             
              if(what.equals("product")){
                   System.out.println("you entered in elseBlock ...");
                     path=req.getParameter("path");
                     downloadpath="WEB-INF/uploads/"+ path;
             }  
             
              System.out.println("what : "+what);
               System.out.println(" Parameter path "+path);
              System.out.println("downloadpath  in picdownloadservlet : "+downloadpath);
         InputStream is= context.getResourceAsStream(downloadpath);
         OutputStream os=res.getOutputStream();
         int count=0;
         
         byte []arr=new byte[256];
         while((( count = is.read(arr)) != -1)){
                  os.write(arr);
         }
        os.flush();
        is.close();
    }
}