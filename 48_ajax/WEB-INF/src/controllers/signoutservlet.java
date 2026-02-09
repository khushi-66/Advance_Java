package controllers;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/signout.do")
public  class signoutservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException {
         HttpSession session=req.getSession();

         session.invalidate();
         res.getWriter().print(true);
    }
}