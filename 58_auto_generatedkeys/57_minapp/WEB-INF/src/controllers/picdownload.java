package controllers;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import modals.user;
import javax.servlet.ServletContext;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import java.io.IOException;
@WebServlet("/picdownload.do")
public class picdownload extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        HttpSession session=req.getSession();
        res.setContentType("image/png");
        user u=(user) session.getAttribute("user");
        ServletContext context=getServletContext();
         InputStream is= context.getResourceAsStream("WEB-INF/uploads/"+u.getpic());
         OutputStream os=res.getOutputStream();
         int count=0;
         byte []arr=new byte[256];
         while((( count = is.read(arr)) != -1)){
                  os.write(arr);
         }
        os.flush();
        is.close();
    }
}