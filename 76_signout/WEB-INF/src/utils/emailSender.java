package utils;
 import java.util.Properties;

import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;

public class emailSender{
     public static void   sendEmail(String receiver,String msg,String subject){
 Properties ps=new Properties();

       ps.put("mail.transport.protocol","smtp");
        ps.put("mail.smtp.host","smtp.gmail.com");
       ps.put("mail.smtp.port","587"); 
       ps.put("mail.smtp.auth","true");
      ps.put("mail.smtp.starttls.enable","true");
      

       Session session=Session.getInstance(ps,new mailauthenticator());

       try {
           MimeMessage mm=new MimeMessage(session);
String gmail=System.getenv("GmailID");
           mm.setRecipients(Message.RecipientType.TO,receiver);
           mm.setSubject(subject);
         mm.setFrom(gmail);
          
     mm.setContent(msg,"text/html");
      System.out.println("attempt to send email.................");
          Transport.send(mm);
      System.out.println("attempt successful............................");
        } catch (MessagingException e) {
         e.printStackTrace();
       }
        
    }
}

class mailauthenticator extends Authenticator{
    public PasswordAuthentication  getPasswordAuthentication(){

        
    String gmail=System.getenv("GmailID");
    String appPassword=System.getenv("GmailAppPassword");
        return  new PasswordAuthentication(gmail,appPassword);
    }
}
     
