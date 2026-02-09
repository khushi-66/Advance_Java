package controllers;
import modals.user;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import modals.product;
import modals.pic;
@WebServlet("/show.do")
public class showproduct extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException{
         HttpSession session=req.getSession();
        user userObj=(user)session.getAttribute("user");
        if(userObj != null){
            ArrayList <product>products=product.collectproducts(userObj);
            for( product p:products ){
                 ArrayList<pic>pics= pic.collectpics(p);
                 System.out.println(pics);
                 p.setpics(pics);
                  System.out.println(p.getpics());
            }
            req.setAttribute("product",products);
  System.out.println(products);
            req.getRequestDispatcher("showproduct.jsp").forward(req,res);
        }
    }
}
