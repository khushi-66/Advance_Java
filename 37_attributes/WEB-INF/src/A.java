import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;
@WebServlet("/show.do")
public class A extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
      req.setAttribute("name","sumit");
      req.getRequestDispatcher("next.jsp").forward(req,res);
    }
}