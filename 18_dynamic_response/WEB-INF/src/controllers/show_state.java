package controllers;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletException;
  import models.City;
 import models.State;
   
@WebServlet("/show.do")
public class show_state extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
       State [] state = {   new State(  1,"MP") ,   new State(  2,"UP"),   new State(  3,"maharastra"),
        new State(  4,"west bengal") };

       res.setContentType("text/html");
        String stateid= req.getParameter("state_id");
        PrintWriter pw=res.getWriter();       
        pw.write("<html lang='en'>");       
         pw.write(" <head> ");
          pw.write(" <title>servlet response ::  </title> </head>");
                    pw.write(" <body>");
                     pw.write("<form  action='show_cities.do' style='font-size:32px; text-align:center;'> Select State        ");
                 pw.write("<select name='state_id'>");
             for(  State next:state){
                
                     pw.write("<option  value='"+next.pin +"'  style='font-size:32px; text-align:center;'>" );
                     pw.write( next.statename +"</option>");
                 
               } 
                           pw.write("</select> <br><br>");
                           
       pw.write("<input type='submit' value='Show Cities'>");
       pw.write("</form>");
            pw.write(" </body>");
            pw.write("</html>");
            pw.close();

    }}

