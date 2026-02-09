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
 
@WebServlet("/show_cities.do")
public class show_cities extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
  State [] state = {   new State(  1,"MP") ,   new State(  2,"UP"),   new State(  3,"maharatra"),
        new State(  4,"west bengal") };
        City [] city = {   new City(  state[0],"jaipur",1) ,   new City(  state[0],"indore",2),   new City(  state[0],"satna",3), 
          new City(state[1],"banda",4) ,   new City(  state[1],"indore",5),   new City(  state[1],"satna",6),
        new City(  state[2],"lakhnau",7) ,new City(  state[2],"kanpur",8) ,new City(  state[2],"nagpur",9) ,new City(  state[3],"bhopal",10) ,new City(  state[3],"varanasi",11) 
    
    
    };
        
       res.setContentType("text/html");
        Integer stateid=  Integer.parseInt(req.getParameter("state_id"));
        PrintWriter pw=res.getWriter();       
        pw.write("<html lang='en'>");       
         pw.write(" <head> ");
          pw.write(" <title>servlet response ::  </title> </head>");
                    pw.write(" <body>");
                       pw.write("<form  action='show_cities.do'>");
                 pw.write("<select name='state_id'>");
             for(  City next:city){
                
                   if(next.state.pin.equals(stateid)) { pw.write("<option  value='"+next.city_id +"'  style='font-size:32px; text-align:center;'>" );
                     pw.write( next.cityname +"</option>");}
                 
               } 
                           pw.write("</select>");
       pw.write("</form>");
            pw.write(" </body>");
            pw.write("</html>");
            pw.close();

    }}

