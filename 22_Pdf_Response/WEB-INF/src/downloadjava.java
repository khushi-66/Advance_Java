import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax. servlet.RequestDispatcher;
import javax.servlet.ServletContext;

@WebServlet("/java.do")
public class downloadjava extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
 res.setContentType("application/pdf");
      ServletContext context= getServletContext();
   InputStream is=context.getResourceAsStream("/WEB-INF/java.pdf");
OutputStream os=res.getOutputStream(); int count=0;
byte [] arr=new byte[256];
while((count=is.read(arr))!=-1){
   os.write(arr);
}
os.flush();
os.close();

      
   
   }}