package controllers;
import com.google.gson.Gson;
import models.Product;
import models.User;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/fetch_user.do")
public class fetchuserservlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
   HttpSession session=req.getSession();
       User user= (User)session.getAttribute("user");
      String json="false";
      if(user!=null){
        json=new Gson().toJson(user);
      }
  res.getWriter().write(json);
    }
}