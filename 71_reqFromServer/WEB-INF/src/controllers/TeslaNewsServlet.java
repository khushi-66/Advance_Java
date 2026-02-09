package controllers;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
//import java.io.OutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.DataOutputStream;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;
import javax.json.JsonArray;

@WebServlet("/news.do")
public class  TeslaNewsServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
          String apikey=System.getenv("apikey");
      URL url = new URL("https://newsapi.org/v2/everything?q=tesla&from=2025-12-10&sortBy=publishedAt&apiKey="+apikey);

          
           HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setDoOutput(true);
            con.connect();
            DataOutputStream dos=new DataOutputStream(con.getOutputStream());
            dos.close();
            dos.flush();
try {  Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace();  }

            int statuscode=con.getResponseCode();

            System.out.println(statuscode + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            if(true){
                  InputStream is=con.getInputStream();
                  JsonReader jr=Json.createReader(is);
                  JsonObject jo=jr.readObject();
                  res.getWriter().write(jo.getInt("totalResults"));
            }
      
              dos.flush();
              dos.close();
            }


    }
