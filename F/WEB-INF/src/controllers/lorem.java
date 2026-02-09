import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
@WebServlet("/lorem.do")
public class lorem extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        System.out.println("Hello Lorem....");
          res.sendRedirect("lorem.html");
      //  req.getRequestDispatcher("http://rgpv.ac.in").forward(req,res);//not ok
       // res.sendRedirect("http://rgpv.ac.in"); //ok
   
    }
}