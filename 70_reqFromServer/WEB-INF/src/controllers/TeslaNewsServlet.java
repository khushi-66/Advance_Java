package controllers;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.DataOutputStream;

@WebServlet("/news.do")
public class  TeslaNewsServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
           URL url = new URL("https://newsapi.org/v2/everything?q=tesla&from=2025-12-10&sortBy=publishedAt&apiKey=f7ce32508a5c4dcba1c871e4184aa4b5");
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
            if(statuscode == HttpURLConnection.HTTP_OK){
                  res.setContentType("application/json");
                  OutputStream os= res.getOutputStream();
                  InputStream is=con.getInputStream();
                  byte[] arr=new byte[256];
                  int count=0;
                  while((count=is.read(arr)) !=-1){
                        os.write(arr,0,count);
                  }
                  os.flush();
                  os.close();
                  is.close();

            }


    }
}