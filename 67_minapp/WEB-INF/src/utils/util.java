package utils;
import java.util.Random;
public class util {
   static Random random=new Random();
    public static String generateVerificationCode(){
        return java.util.UUID.randomUUID().toString().replace("-", " ");
    }

   public  static String generateotp(){

    
     return Integer.toString(random.nextInt(899999)+100000);
    }
}
