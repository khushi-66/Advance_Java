import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import java.util.ArrayList;

class teacher{
   String name;
   String age;
   State state;
   City city;
   teacher(String name,String age,City city, State state){
      this.name=name;
      this.age=age;
      this.city=city;
      this.state=state;
      


   }
}
   class State{
      String statename ;
      int pin;
      State(String statename ,int pin){
         this.statename=statename;
         this.pin=pin;
      }
   }
   class City{
      String cityname ;
      int citycode;
      City(String cityname ,int citycode){
         this.cityname=cityname;
         this.citycode=citycode;
      }
   }



@WebServlet("/show.do")
public class actionservlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
      ArrayList<teacher> x =new  ArrayList <teacher>();
  
      x.add(new teacher("khushi","22",new City("jaipur",34)  ,new State("rajasthan",8934)));
      x.add(new teacher("Addi","39",new City("patna",91)  ,new State("Bihar",8344)));
      x.add(new teacher("arshi","52",new City("indore",30)  ,new State("MP",4034)));
      x.add(new teacher("mukul","32",new City("Amritsar",71)  ,new State("Punjab",263875)));
      x.add(new teacher("rishabh","2",new City("prayagraj",13)  ,new State("UP",7349)));
      x.add(new teacher("venkat","66",new City("bangloru",34)  ,new State("tamilnadu",0034)));
       
      res.setContentType("text/html");
        String name=req.getParameter("name");   String ct=req.getParameter("city");
        PrintWriter pw=res.getWriter();       String s=req.getParameter("state");
        pw.write("<html lang='en'>");       String ag=req.getParameter("age");
         pw.write(" <head> ");
          pw.write(" <title>servlet response ::  </title> </head>");
                    pw.write(" <body>"); 
             pw.write(" <h1>Records Demo </h1> ");
             pw.write("<form>  ");
                
                  
             for(teacher next:x){
                  pw.write("<h2>");
                 pw.write(  next.name );
                 pw.write("</h2>");
                     pw.write("<select>");
                    pw.write("<option   name= 's' value = '"+  next.state.statename   +"'>");
                 
                 pw.write("</option>");
                  pw.write("</select>");
                 
               }
       pw.write("</form>");
            pw.write(" </body>");
            pw.write("</html>");
            pw.close();

    }}

