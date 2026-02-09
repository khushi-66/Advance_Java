package controllers;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;
@WebServlet("/signin.do")
public  class signinservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException {
         HttpSession session=req.getSession();
         String email=req.getParameter("email");
         String password=req.getParameter("password");
       User user=new User(email,password);
               boolean flag=user.signinUser();
        if(flag){
            session.setAttribute("user",user);
        }
      res.getWriter().print(flag);
      
    }
}