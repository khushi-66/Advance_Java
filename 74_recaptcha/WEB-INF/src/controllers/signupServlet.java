package controllers;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
@WebServlet("/signup.do")
public class signupServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
        String captcha =req.getParameter("g-recaptcha-response");
      System.out.println(captcha);
    String secretKey = "6LdRFSssAAAAACL3a5svUt9ROIa9T8Aq2YDUqx-L";
        String apiReqURL = "https://www.google.com/recaptcha/api/siteverify?secret="+secretKey+"&response="+captcha;
        URL url = new URL(apiReqURL);

        HttpURLConnection con = (HttpURLConnection)url.openConnection();

        con.setRequestMethod("POST");
        con.setDoOutput(true);

        con.connect();

        DataOutputStream dos = new DataOutputStream(con.getOutputStream());

        dos.close();

        int responseCode = con.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) {
            InputStream is = con.getInputStream();

            JsonReader jr = Json.createReader(is);
                        
            JsonObject jo = jr.readObject();

            

            System.out.println(jo + " %%%%%%%%%%%%% -    - %");
        }



     req.getRequestDispatcher("index.html").forward(req,res);
   
    }
}