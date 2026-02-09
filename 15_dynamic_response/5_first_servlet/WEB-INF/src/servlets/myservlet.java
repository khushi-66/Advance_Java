package  servlets;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
@WebServlet("/act.do")
public class myservlet extends HttpServlet {

public void doGet( HttpServletRequest  request, HttpServletResponse response) throws IOException , ServletException{
System.out.println("hello world");
}

}