import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
@WebServlet("/form.do")
public class submitForm extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        String name=req.getParameter("uname");
      String phoneno =req.getParameter("ph");
      String email=req.getParameter("email");
      String password=req.getParameter("password");
      res.setContentType("text/html");
        PrintWriter obj=  res.getWriter();
      obj.write("<Doctype html>");
       obj.write("<html>");
      obj.write("<head>");
      obj.write("</head>");
     obj.write("<body>");
     obj.write("<div style='text-align:center;background-color:rgba(179, 211, 178, 0.945);'>");
   obj.write("<h1>Registration Form Data</h1>");
    obj.write("<table border='1'align='center'>");
    obj.write("<tr><th>Name</th><th>Email</th> <th>phone_Number</th><th>Password</th></tr>");
   obj.write("<tr>");
   obj.write("<td>"+name+"</td>");
    obj.write("<td>"+email+"</td>");
     obj.write("<td>"+phoneno+"</td>");
      obj.write("<td>"+password+"</td>");
   obj.write("</tr>");
    obj.write("</table>");
   obj.write("</div>");
   obj.write("</body>");
    obj.write("</html>");
     System.out.println("helloworld");
obj.close();
    }
}
