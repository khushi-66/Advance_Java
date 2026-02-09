package controllers;
import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import models.Student;
import java.util.ArrayList;
@WebServlet("/edit.do")
public class editservlet extends HttpServlet{
   public  void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
      Integer studentid= Integer.parseInt(req.getParameter("student_id"));
    Student s=new Student();
   s.setStudentId(studentid);
   s.fetch();
   req.setAttribute("students",s);
    req.getRequestDispatcher("update.jsp").forward(req,res);
}
    

    public  void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
     Integer studentid=Integer.parseInt( req.getParameter("student_id") );
      String name= req.getParameter("name");
      Integer age= Integer.parseInt(req.getParameter("age"));
      Float marks= Float.parseFloat(req.getParameter("marks"));
      String college= req.getParameter("college");
      Student s=new Student();
   s.setStudentId(studentid);
   s.setName(name);
   s.setAge(age);
   s.setCollege(college);
   s.setMarks(marks);
   s.update();
 req.getRequestDispatcher("show.do").forward(req,res);


    }
    
}