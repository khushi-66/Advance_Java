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
           
    if(u.getuserId()  != null){

          session.setAttribute("user",u);
          nextpage="dashboard.jsp";
    }
    else{
        request.setAttribute("error","Sorry Login Failed Please Try Again....");
             }

         request.getRequestDispatcher(nextpage).forward(request,response);
    }
}
