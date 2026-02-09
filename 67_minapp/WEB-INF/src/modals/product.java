package modals;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modals.pic;
public class product {
    private Integer productId;
    private  user userObj;
    private String name;
    private Integer price;
    private Integer quantity;
    private ArrayList<pic>pics;

    public static ArrayList<product> collectproducts(user userObject){
        ArrayList<product>products=new ArrayList<product>();
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
            String query="select * from products where user_id=?";
            PreparedStatement ps =con.prepareStatement(query);
              ps.setInt(1,userObject.getuserId());
              ResultSet rs=ps.executeQuery();
              while(rs.next()){
                   product p=new product();
                   p.productId=rs.getInt("productId");
                   p.name=rs.getString("name");
                   p.price=rs.getInt("price");
                   p.quantity=rs.getInt("quantity");
                   p.userObj=userObject;
                   products.add(p);
              }

         
        
          con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
         }


        return products;
    
    }
    
    public boolean saveProduct( ){
        boolean flag=false;
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
        String query="insert into products (name,price,quantity,user_id) value(?,?,?,?)"; 
           PreparedStatement ps= con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
          ps.setString(1,name);
          ps.setInt(2,price);
          ps.setInt(3,quantity);
          ps.setInt(4,userObj.getuserId());
           int val= ps.executeUpdate();

           if(val == 1){
                flag=true;
                ResultSet rs=ps.getGeneratedKeys();

                if(rs.next()){
                    productId=rs.getInt(1);
                }
           }
           con.close();
    } catch (SQLException    | ClassNotFoundException e) {
            e.printStackTrace();
        }
           


        return flag;
    }
   



    public Integer getProductId() {
        return productId;
    }

    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

   
    

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Integer getPrice() {
        return price;
    }

    
    public void setPrice(Integer price) {
        this.price = price;
    }

    
    public Integer getQuantity() {
        return quantity;
    }

    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    
    public user getUserObj() {
        return userObj;
    }

    
    public void setUserObj(user userObj) {
        this.userObj = userObj;
    }

   
    public  ArrayList<pic>  getpics() {
        return pics;
    }

    
    public void setpics( ArrayList<pic>pics) {
        this.pics = pics;
    }

}
