package modals;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class user  {
    private Integer userId ;
    private String email;
    private String password;
    private String name;
    
   public int saveUser() {
    boolean flag=false;
    int key=0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?user=root&password=1234");
       String query="insert into users (name,email,password) value (?,?,?)";
       PreparedStatement ps=con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
       ps.setString(1,name);
       ps.setString(2,email);
       ps.setString(3,password);
      int val= ps.executeUpdate();
  if( val == 1){
  flag=true;
     ResultSet rs= ps.getGeneratedKeys();
     if(rs.next()){
      key=rs.getInt(1);
     
  }
}
       con.close();
    } catch (SQLException | ClassNotFoundException e) {

        e.printStackTrace();
    }
        return key;
   }
   

public void setuserId(Integer userId){
    this.userId=userId;
}

public Integer getuserId(){

    return this.userId;
}


    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
