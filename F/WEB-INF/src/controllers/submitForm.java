import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
@WebServlet("/form.do")
public class submitForm extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
      String name=req.getParameter("uname");
      String phoneno =req.getParameter("ph");
      String email=req.getParameter("email");
      String password=req.getParameter("password");
      String uploadedFile=req.getParaetr("file");
        ArrayList<String>arr=new ArrayList<String>();
        arr.add(name);
       arr.add(email);
        arr.add(phoneno);
         arr.add(password);
         arr.add(uploadedFile);
         req.setAttribute("parameter",arr);
        System.out.println("go to jsp....");
        req.getRequestDispatcher("records.jsp").forward(req,res);
        
      
    }
}
