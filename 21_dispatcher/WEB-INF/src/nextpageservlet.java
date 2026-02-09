import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax. servlet.RequestDispatcher;


@WebServlet("/next.do")
public class nextpageservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
   //Request Handling
      System.out.println("hello duniya walon....");
     //Request Generation(page creation)
      RequestDispatcher view=  req.getRequestDispatcher("java.pdf");
      view.forward(req,res);
   
   }}