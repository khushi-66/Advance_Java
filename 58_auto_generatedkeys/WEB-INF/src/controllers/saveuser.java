package controllers;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import modals.user;
import java.io.File;
@WebServlet("/save.do")
public class saveuser extends HttpServlet {
    public  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException , ServletException {
         String name=req.getParameter("name");
         String email=req.getParameter("email");
         String password=req.getParameter("psb");
         user u=new user();
         u.setName(name);
         u.setPassword(password);
         u.setEmail(email);

        int userid= u.saveUser();

        u.setuserId(userid);
        System.out.println("userId autogeneterated key : "+userid);
        if(userid !=  0){
            String uploadpath=req.getServletContext().getRealPath("/WEB-INF/uploads");
            File file=new File(uploadpath,Integer.toString(userid)+"_"+u.getName());
            file.mkdir();
        }
         req.getRequestDispatcher("index.html").forward(req,res);
    }
}