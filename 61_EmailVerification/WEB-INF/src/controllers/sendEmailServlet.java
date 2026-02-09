package controllers;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import utils.sendEmail;
@WebServlet("/email.do")
public class sendEmailServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
       String email=req.getParameter("email");
          sendEmail.send(email, "Your Account Verified we will contact soon regarding new update","Account Verification Email......"); 
       
        req.getRequestDispatcher("next.html").forward(req,res);
    }
}

