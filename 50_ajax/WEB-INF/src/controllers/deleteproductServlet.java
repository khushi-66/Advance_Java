 package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Product;
import models.User;


@WebServlet({"/del_product.do"})
public class deleteproductServlet extends HttpServlet {
  

   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
      HttpSession session= req.getSession();
      User user = (User)session.getAttribute("user");
      if (user != null) {
         Integer productId = Integer.parseInt(req.getParameter("product_id"));
         res.getWriter().print(Product.deleteproduct(productId, user.getUserId()));
         System.out.println(Product.deleteproduct(productId, user.getUserId()));
      } else {
         res.getWriter().write("  Sorry !! Your Session is  Expired...");
      }

   }
}
 