import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletException;
@WebServlet("/show.do")
public class actionservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
        String []name={"sohan", "rohan ","gohan","ganesh","vikram","madhu"};
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.write("<html lang='en'>");
         pw.write(" <head> ");
          pw.write(" <title>servlet response ::  </title ");
                    pw.write(" <body>"); 
             pw.write(" <h1>records demo </h1> ");
             for(String next:name){
                 pw.write(" <h2>  " +next +"</ h2>");
             }
            pw.write(" </body>");
            pw.close();

    }}

