package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/act.do"})
public class actionservlet extends HttpServlet {
   
   

   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String a= req.getHeader("host");
      String b = req.getHeader("user_agent");
      String c = req.getHeader("accept-language");
      String d = req.getHeader("accept-encoding");
      String e = req.getHeader("accept-charset");
      String f = req.getHeader("keep-alive");
      String g = req.getHeader("connection");
      String h=req.getHeader("accept");
      String i=req.getHeader("cookie");
      System.out.println("host   =         " + a);
      System.out.println("user-agent   =         " + b);
      System.out.println("accept-language    =         " + c);
      System.out.println("accept-encoding    =         " + d);
      System.out.println("accept-charset    =         " + e);
      System.out.println("keep-alive     =         " + f);
      System.out.println("connection      =         " + g);
      System.out.println("accept      =         " + h);
      System.out.println("cookie      =         " + i);
   }}