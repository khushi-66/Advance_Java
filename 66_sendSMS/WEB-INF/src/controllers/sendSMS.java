package controllers;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
@WebServlet("/sendotp.do")
public class sendSMS extends HttpServlet{
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
          String phone=req.getParameter("phone");
          System.out.println(phone);
         String authtoken=System.getenv("Auth_Token");
    String authsid=System.getenv("Auth_SID");
         Twilio.init(authsid,authtoken);
          
          String twilioph=System.getenv("Twiliophone");
         Message msg=Message.creator(new PhoneNumber("+91"+phone),new PhoneNumber(twilioph),"Hello Your OTP to Verify Phone...").create();
            
         System.out.println(msg.getBody());
          req.getRequestDispatcher("next.html").forward(req,res);


  }}
