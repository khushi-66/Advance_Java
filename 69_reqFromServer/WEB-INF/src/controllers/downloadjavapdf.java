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

@WebServlet("/download.do")
public class  downloadjavapdf extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
          URL url = new URL("https://www.iitk.ac.in/esc101/share/downloads/javanotes5.pdf");
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setDoOutput(true);
            con.connect();
            DataOutputStream dos=new DataOutputStream(con.getOutputStream());
            dos.close();
            dos.flush();
            int statuscode=con.getResponseCode();
            if(statuscode == HttpURLConnection.HTTP_OK){
                  OutputStream os= res.getOutputStream();
                  InputStream is=con.getInputStream();
                  byte[] arr=new byte[256];
                  int count=0;
                  while((count=is.read(arr)) !=-1){
                        os.write(arr);
                  }
                  os.flush();
                  os.close();

            }


    }
}