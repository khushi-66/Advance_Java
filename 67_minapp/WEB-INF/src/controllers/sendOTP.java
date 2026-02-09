package controllers;
import modals.user;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import utils.util;
import utils.smsSender;
@WebServlet("/sendotp.do")
public class sendOTP extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
         String phone=req.getParameter("phone");
      String otp=   util.generateotp();

      HttpSession session=req.getSession();
      System.out.println("trying to send otp.......");
      session.setAttribute(phone,otp);
      smsSender.sendSMS(phone,"ISRCDC Jabalpur : OTP for mobile verification : " +otp);
         System.out.println(otp);
         res.getWriter().print(true);
    
    }
    }
