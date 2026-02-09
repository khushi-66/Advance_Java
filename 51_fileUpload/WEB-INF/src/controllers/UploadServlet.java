
package controllers;
import  javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.File;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import javax.servlet.ServletContext;
@WebServlet("/upload.do")
public class UploadServlet  extends HttpServlet{
    public void doPost(HttpServletRequest req  ,  HttpServletResponse res) throws ServletException,IOException{
            
            if(ServletFileUpload.isMultipartContent(req)){
            ServletContext context=getServletContext();
            DiskFileItemFactory dfif=new DiskFileItemFactory();
             ServletFileUpload fileupload=new ServletFileUpload(dfif);
             List<FileItem>fileItems=null;
             try {
                 fileItems=fileupload.parseRequest(req);

                  } catch (FileUploadException  e) {
                   e.printStackTrace();
             }
                 FileItem fileitem=fileItems.get(0);
                 String uploadpath=context.getRealPath("/");
                 System.out.println(uploadpath);
                 String filename=fileitem.getName();
                 File file=new File(uploadpath,filename);
              try {
                    fileitem.write(file);
              } catch (Exception e) {
                e.printStackTrace();
              }
            }
             req.getRequestDispatcher("index.html").forward(req,res);
    }
}




