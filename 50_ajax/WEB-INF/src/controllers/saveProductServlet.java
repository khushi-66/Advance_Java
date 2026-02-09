package controllers;

import models.Product;
import models.User;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/save_product.do")
public class saveProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
   HttpSession session=req.getSession();
       User user= (User)session.getAttribute("user");
       if(user!=null){
        String productName=req.getParameter("product_name");
        Integer productPrice=Integer.parseInt(req.getParameter("product_price"));
       Integer productQuantity=Integer.parseInt(req.getParameter("product_quantity"));
       String productDescription=req.getParameter("product_description");
   Product product=new Product(productName, productPrice, productQuantity, productDescription, user);
   res.getWriter().print(product.saveProduct());
        }

    }
}
