
package controllers;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Driver;
public class stationary {
    String  productName;
    float price;
    int productId;
    Date placeDate;
    Date deliverydate;
    int productQuantity;
       public boolean saveData(){
        boolean flag=false;
        try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
        String query="insert into statinarydb (deliverydate,dispatchdate,quantity, name,price,orderedtime)values(?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,);
        ps.setString(2,);
        ps.setInt(3,);
       int val= ps.executeUpdate();
       if(val==1){
        flag=true;
       }

        }
        catch(SQLException | ClassNotExcepton e){
            e.printStackTrace();
        }
           return flag;
       }

}
