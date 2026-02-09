package modals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class pic {
    private Integer picId;
    private product productObj;
    private String path;
    
public static  boolean savepic(ArrayList<pic>pics){
    boolean flag=false;
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
          String query="insert into pics  (productId,path) value (?,?)";
         PreparedStatement ps=con.prepareStatement(query);
             for(pic p:pics ){
                ps.setInt(1,p.getProduct().getProductId());
                ps.setString(2,p.getPath());
              int val=  ps.executeUpdate();
                if(val >= 0){
                    flag=true;
                }
                                        }
                  con.close();
          } 
          catch (SQLException |ClassNotFoundException e) {
                         e.printStackTrace();
                                                  }
      return flag;
}
    
    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    
    public product getProduct() {
        return productObj;
    }

    
    public void setProduct(product productObj) {
        this.productObj = productObj;
    }

    
    public String getPath() {
        return path;
    }

    
    public void setPath(String path) {
        this.path = path;
    }

}
