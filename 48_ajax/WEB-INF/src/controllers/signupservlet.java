package controllers;
import java.io.IOException;
import javax.security.sasl.SaslException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;
@WebServlet("/signup.do")
public  class signupservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException {
         String name=req.getParameter("uname");
         String email=req.getParameter("email");
         String password=req.getParameter("password");
         User user=new User(name,email,password);
        res.getWriter().print(user.saveUser());
      
    }
}