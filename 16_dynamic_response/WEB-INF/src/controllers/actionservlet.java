import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import java.sql.Date;

import java.text.SimpleDateFormat;
class student{
   String name;
   String age;
   Date dob;
   float marks;
   student(String name,String age,Date dob,float marks){
      this.name=name;
      this.age=age;
      this.dob=dob;
      this.marks=marks;
   }
}
@WebServlet("/show.do")
public class actionservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
        student []s={new student("khushi","22",Date.valueOf("2005-2-12"),34.5f),new student("om","32",Date.valueOf("2003-5-3"),7.23f),
    new student("rishabh","92",Date.valueOf("2015-2-2"),39.5f),new student("ommy","72",Date.valueOf("1903-5-3"),89.3f)
      };
        res.setContentType("text/html");
        SimpleDateFormat  sdf= new SimpleDateFormat("dd,MMMM,YYYY");
        String name=req.getParameter("name");   String ag=req.getParameter("age");
        PrintWriter pw=res.getWriter();
        pw.write("<html lang='en'>");
         pw.write(" <head> ");
          pw.write(" <title>servlet response ::  </title>  <style>table{align:center;background:antiquewhite;</style> </head>");
                    pw.write(" <body>"); 
             
             pw.write("<table border='1' style='text-align:center'>");
                          pw.write(" <th colspan='4'>Student Records......</th> ");

                                 pw.write("<tr>");
                                 pw.write("<td>Name</td>");
                                  pw.write(" <td>Age</td>");
                                  pw.write("<td>Dob</td>");
                                  pw.write(" <td>Marks</td>");
                                  pw.write("</tr>");
             for(student next:s){
                
                     pw.write("<tr>");
                     pw.write(" <td>" +next.name+"</td>");
                pw.write("<td>" +next.age+"</td>");
                pw.write(" <td>" + sdf.format ( next.dob  )+"</td>");
                pw.write("<td>" +next.marks+"</td>");
                pw.write("</tr>");
                 
               }
       pw.write("</table>");
            pw.write(" </body>");
            pw.write("</html>");
            pw.close();

    }}

