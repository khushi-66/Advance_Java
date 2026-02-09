package controllers;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import modals.user;
import java.io.IOException;
import javax.servlet.http.HttpSession;

@WebServlet("/signin.do")
public class signin extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException{
       HttpSession session=request.getSession();
        String email=request.getParameter("email");
    String password=request.getParameter("psb");
   

    String nextpage="signin.jsp";
    user u=new user();
    u.setemail((email));
    u.setpassword(password);
    u.signin();
           System.out.println( "user id : "+u.getuserId());
    if(u.getuserId()  != null){
          int stId=u.getStatus().getStatusId();
          if(stId == 2){
            session.setAttribute("user",u);
          nextpage="dashboard.jsp";
          }else{
                   request.setAttribute("error", "Login failed... Your Account is " + (stId==1?"Inactive":stId==3?"Blocked":"Closed"));
          }
         
    }
    else{
        request.setAttribute("error","Sorry Login Failed Please Try Again.......");
             }
      
         request.getRequestDispatcher(nextpage).forward(request,response);
    }
}
