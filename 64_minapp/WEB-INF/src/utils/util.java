package utils;

public class util {
    
    public static String generateVerificationCode(){
        return java.util.UUID.randomUUID().toString().replace("-", " ");
    }

}
