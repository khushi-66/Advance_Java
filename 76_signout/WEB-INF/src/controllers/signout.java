package controllers;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;;
@WebServlet("/signout.do")
public class signout extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException{
             HttpSession session=req.getSession();
             session.invalidate();
             res.getWriter().print(true);
             req.getRequestDispatcher("index.html").forward(req,res);
    }
}