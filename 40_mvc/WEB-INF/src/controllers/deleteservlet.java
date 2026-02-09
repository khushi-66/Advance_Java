package controllers;
import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import models.Student;
import java.util.ArrayList;
@WebServlet("/delete.do")
public class deleteservlet extends HttpServlet{
   public  void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
      Integer studentid= Integer.parseInt(req.getParameter("student_id"));
       Student.delete(studentid);
    
         
req.getRequestDispatcher("show.do").forward(req,res);



    }
    

}