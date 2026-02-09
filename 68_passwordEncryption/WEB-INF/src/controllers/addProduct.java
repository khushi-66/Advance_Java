
package controllers;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import modals.product;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import modals.user;
import modals.pic;
import java.io.File;
import modals.product;
import javax.servlet.ServletContext;
@WebServlet("/addproduct.do")
public class addProduct extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException , IOException{
             HttpSession session= req.getSession();
             user userObj=(user)session.getAttribute("user");
               System.out.println(  " name : ----------"+userObj.getuserId());
              ServletContext context=req.getServletContext();
                if(ServletFileUpload.isMultipartContent(req)){
                 
                DiskFileItemFactory dfif=new DiskFileItemFactory();
                ServletFileUpload sfu=new ServletFileUpload(dfif);
                         try{
                       List<FileItem>fileitems= sfu.parseRequest(req);
                       ArrayList<FileItem>productpics=new ArrayList<FileItem>();
                         product p=new product();
                         for (FileItem fileitem: fileitems){
                            String fieldName=fileitem.getFieldName();
                              String value=fileitem.getString();

                            if(fileitem.isFormField()){
                                if(fieldName.equals("name")){
                                    p.setName(value);
                                }else if( fieldName.equals("price")){
                                    p.setPrice(Integer.parseInt(value));
                                }else if(fieldName.equals("quantity")){
                                    p.setQuantity(Integer.parseInt(value));
                                            }
                                    }
                                        
                                    else{

                                     productpics.add(fileitem);
                                 }
                                        }

                                System.out.println(  " name : ----------"+userObj.getuserId());
                                p.setUserObj(userObj);

                System.out.println("Is Product added ?  : " + p.saveProduct());
               //  System.out.println(  " productID --- : "+p.getProductId());

                      if (p.getProductId() !=  null){
                         String path=context.getRealPath("/WEB-INF/uploads/"+userObj.getemail()+"/products");
                              File pathFolder=new File(path,   p.getProductId().toString()+ "__"+p.getName());
                                  pathFolder.mkdir();

                                  ArrayList<pic>pics=new ArrayList<pic>();
                                  for(FileItem fileitem : productpics){
                                       pic pi=new pic();
                                       String picpath=userObj.getemail()+"/products/"+p.getProductId()+ "__"+p.getName()+"/"+fileitem.getName();
                                      pi.setPath(picpath);
                                      pi.setProduct(p);
                                      System.out.println(  "product object of pic : "+pi.getProduct());

                                      pics.add(pi);

                                      File filepath=new File(pathFolder,fileitem.getName());
                                      fileitem.write(filepath);
                                        System.out.println("product Object : "+p);
                                  }

                                  
                             pic.savepic(pics);

                      }
                   
                 } catch(FileUploadException e){
                
                    }catch(Exception e){
                        e.printStackTrace();
                    }
            }

           req.getRequestDispatcher("dashboard.jsp").forward(req,res);
    }
}
