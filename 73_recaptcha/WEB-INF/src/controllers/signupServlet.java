package controllers;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
@WebServlet("/signup.do")
public class signupServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
        String captcha =req.getParameter("g-recaptcha-response");
      System.out.println(captcha);
     req.getRequestDispatcher("index.html").forward(req,res);
   
    }
}