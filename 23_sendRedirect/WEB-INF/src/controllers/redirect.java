package controllers;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
@WebServlet("/redirect.do")
public class redirect extends HttpServlet{
  public void doGet( HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
    System.out.println("hello Redirect...");
   // res.sendRedirect("http://rgpv.ac.in"); 
   // res.sendRedirect("http://www.porche.com/international/");
  //  res.sendRedirect("http://localhost:8080/21_Pdf_Response");
res.sendRedirect("next.html");
  }
}