package controllers;
import com.google.gson.Gson;
import models.Product;
import models.User;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/all_products.do")
public class showproductservlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
   HttpSession session=req.getSession();
       User user= (User)session.getAttribute("user");
       String result="session_expired";
       if(user!=null){
        ArrayList<Product>products=Product.fetchAllProducts(user.getUserId());
        Gson gson=new Gson();
 result=gson.toJson(products);
       }
res.getWriter().write(result);
    }
}
