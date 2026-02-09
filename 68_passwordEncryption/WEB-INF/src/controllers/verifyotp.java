package controllers;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/verifyotp.do")
public class verifyotp extends HttpServlet{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
         HttpSession session=req.getSession();
         String phone=req.getParameter("phone");
         String clientotp=req.getParameter("otp");
         String saveotp= (String)session.getAttribute(phone);
System.out.println("verified phone.....................");
          res.getWriter().print(clientotp.equals(saveotp));
          System.out.println("client otp : "+ clientotp);
                System.out.println(clientotp.equals(saveotp));

   }
} 