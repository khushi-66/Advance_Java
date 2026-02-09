package controllers;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
   
import models.Student;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*; 
import javax.servlet.http.*;

@WebServlet("/save.do")
public class saveservlet extends HttpServlet{
     ArrayList<Student>students=new ArrayList<Student>();
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
   HttpSession session=req.getSession();
        String studentname=req.getParameter("student_name");
    String studentcollege=req.getParameter("student_college");
    Integer studentage= Integer.parseInt(req.getParameter("student_age"));
    Float studentmarks=  Float.parseFloat(req.getParameter("student_marks"));
    Student student=new Student(studentname, studentcollege, studentage, studentmarks);
    students.add(student);
    session.setAttribute("records",students);
   req.getRequestDispatcher("index.jsp").forward(req,res);
    
    


    }
}