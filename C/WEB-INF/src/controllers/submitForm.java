import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
@WebServlet("/form.do")
public class submitForm extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        String name=req.getParameter("uname");
      String phoneno =req.getParameter("ph");
      String email=req.getParameter("email");
      String password=req.getParameter("password");
      
        
      
    }
}
