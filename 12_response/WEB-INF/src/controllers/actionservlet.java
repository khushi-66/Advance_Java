import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletException;
@WebServlet("/act.do")
public class actionservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
         res.setContentType("text/html");
         PrintWriter pw=res.getWriter();
         
         pw.write("<html lang='en'>");
          pw.write("<head>");
          pw.write("<title>Servlet Response....</title>");
           pw.write("</head>");
           pw.write("<body>");
  pw.write("<h1>my servlet response ......</h1>");
   pw.write("<p>hello duniya walon.....</p>");
            pw.write("</body>");
           
 pw.write("</html>");
        pw.close() ;
        
    }}

