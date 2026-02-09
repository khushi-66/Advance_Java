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
System.out.println("session id " + session.getId());
   System.out.println("cration time : "+ session.getCreationTime());
 System.out.println("last  accessed  time : "+ session.getLastAccessedTime());
 System.out.println("max inactive  time : "+ session.getMaxInactiveInterval());
  System.out.println("Is New  : "+ session.isNew());
   System.err.println(".....................................................................");
    Integer info= (Integer)session.getAttribute("info");
    Integer more_info=(Integer)session.getAttribute("more_info");
    System.out.println(more_info);
    System.err.println( info);
req.getRequestDispatcher("c.html").forward(req,res);
    
   }}
