package controllers;
import  modals.user;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
@WebServlet("/verify.do")
public class verifyEmail extends HttpServlet{
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
      String email =req.getParameter("email");
      String verificationCode=req.getParameter("verification_code");
       boolean flag=user.verifyAccount(email,verificationCode);
       System.out.println("hhhahaahhaahhaha"+flag);
       req.setAttribute("success",flag);
        req.getRequestDispatcher("verificationPage.jsp").forward(req,res);
        

 }
}