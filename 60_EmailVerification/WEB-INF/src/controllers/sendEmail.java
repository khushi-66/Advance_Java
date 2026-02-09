package controllers;
import javax.servlet.http.*;


import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.mail.PasswordAuthentication;
 import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Transport;
@WebServlet("/email.do")
public class sendEmail extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
       String email=req.getParameter("email");
       Properties ps=new Properties();

       ps.put("mail.transport.protocol","smtp");
        ps.put("mail.smtp.host","smtp.gmail.com");
       ps.put("mail.smtp.port","587"); 
       ps.put("mail.smtp.auth","true");
      ps.put("mail.smtp.starttls.enable","true");
      

       Session session=Session.getInstance(ps,new mailauthenticator());

       try {
           MimeMessage msg=new MimeMessage(session);

           msg.setRecipients(Message.RecipientType.TO,email);
           msg.setSubject("Email regarding your application");
         msg.setFrom("sahujii8277@gmail.com");
           msg.setText("yamraj ki jay ho");

          Transport.send(msg);
      
        } catch (MessagingException e) {
         e.printStackTrace();
       }
        req.getRequestDispatcher("next.html").forward(req,res);
    }
}

class mailauthenticator extends Authenticator{
    public PasswordAuthentication  getPasswordAuthentication(){
       String gmail=System.getenv("GmailID");
    String appPassword=System.getenv("GmailAppPassword");
        return  new PasswordAuthentication(gmail,appPassword);
    }
}