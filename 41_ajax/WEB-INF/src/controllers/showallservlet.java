package controllers;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import javax.servlet.ServletException;
@WebServlet("/show_all.do")
public class showallservlet extends HttpServlet{
   public void  doGet (HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
res.getWriter().write("{\"name\":\"yamraj\",\"age\":1000}");
   }

}