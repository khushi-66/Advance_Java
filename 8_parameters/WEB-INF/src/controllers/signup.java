package controllers;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/signup.do")
public class signup extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
  String username=request.getParameter("user_name");
  String email=request.getParameter("email");
  String password=request.getParameter("user_password");
  System.out.println(username);
  System.out.println(email);
  System.out.println(password);
}
}