
package controllers;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import models.Student;

import javax.servlet.annotation.*;
@WebServlet("/show.do")
public class showservlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res)  throws IOException ,ServletException{
     req.getRequestDispatcher("show.jsp").forward(req,res);
    }
    
}
