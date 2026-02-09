package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
 @WebServlet("/c.do")
public class  Cservlet extends HttpServlet{
   public  void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
HttpSession session=req.getSession();
System.out.println("session");
   System.out.println("cration time : "+ session.getCreationTime());
 System.out.println("last  accessed  time : "+ session.getLastAccessedTime());
 System.out.println("max inactive  time : "+ session.getMaxInactiveInterval());
  System.out.println("Is New  : "+ session.isNew());
   System.err.println(".....................................................................");
req.getRequestDispatcher("c.html").forward(req,res);
    
   }}
