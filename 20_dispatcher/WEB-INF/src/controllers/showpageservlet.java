import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax. servlet.RequestDispatcher;


@WebServlet("/show.do")
public class showpageservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
   //Request Handling
      System.out.println(" hello show page  walon....");
     //Request Generation(page creation)
      RequestDispatcher view=  req.getRequestDispatcher("next.html");
      view.forward(req,res);
   
   }}