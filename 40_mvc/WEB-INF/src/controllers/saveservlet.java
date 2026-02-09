package controllers;
import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import models.Student;
import java .util.ArrayList;
@WebServlet("/save.do")
public class saveservlet extends HttpServlet{

  public  void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
      req.getRequestDispatcher("save.jsp").forward(req,res);
 }
    
   public  void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
             String name= req.getParameter("name");
             Integer age= Integer.parseInt(req.getParameter("age"));
             Float marks= Float.parseFloat(req.getParameter("marks"));
             String college= req.getParameter("college");
            Student student=new Student();
                student.setName(name);
                student.setAge(age);
                student.setCollege(college);
                 student.setMarks(marks);
                 student.save();
                 req.getRequestDispatcher("save.jsp").forward(req, res);

               
            



    }
    

}