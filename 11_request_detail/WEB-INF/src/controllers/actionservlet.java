package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
public class actionservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
String URI=req.getRequestURI();
StringBuffer url=req.getRequestURL();
String methodname=req.getMethod();
String servpath=req.getServletPath(); 


System.out.println( "servlet path :"+servpath);
System.out.println(" method name:"+methodname);
System.out.println( "URI : "+URI);
System.out.println("url : " +url);
    }}

    