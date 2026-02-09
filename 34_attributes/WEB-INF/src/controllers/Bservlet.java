package controllers;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
 @WebServlet("/b.do")
public class  Bservlet extends HttpServlet{
   public  void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
HttpSession session=req.getSession();
System.out.println("session");
  System.out.println("session id   : "+ session.getId());

   System.out.println("creation time : "+ session.getCreationTime());
 System.out.println("last  accessed  time : "+ session.getLastAccessedTime());
 System.out.println("max inactive  time : "+ session.getMaxInactiveInterval());
  System.out.println("Is New  : "+ session.isNew());
   System.err.println(".....................................................................");
   session.setMaxInactiveInterval(30);
   session.setAttribute("info",456);
   session.setAttribute("more_info",987);
req.getRequestDispatcher("b.html").forward(req,res);


    }
}