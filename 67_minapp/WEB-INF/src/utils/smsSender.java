package utils;
import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class smsSender {
    public static void sendSMS(String phone,String message){
         String twilioph=System.getenv("Twiliophone");
    String authtoken=System.getenv("Auth_Token");
    String authsid=System.getenv("Auth_SID");
           Twilio.init(authsid,authtoken);
          Message msg=Message.creator(new PhoneNumber("+91"+phone),new PhoneNumber(twilioph),message).create();
            
         System.out.println(msg.getBody());
    }

}
