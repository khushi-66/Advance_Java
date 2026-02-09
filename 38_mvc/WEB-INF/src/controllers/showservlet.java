package controllers;
import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import models.Student;
import java.util.ArrayList;
@WebServlet("/show.do")
public class showservlet extends HttpServlet{
   public  void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
     ArrayList<Student>student= Student.studentall();

    req.setAttribute( "records",student);
         
req.getRequestDispatcher("show.jsp").forward(req,res);



    }
    

}