package modals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class user{
     private Integer userId;
      private String name;
      private String email;
      private String password;
      private String pic;
      private String verificationCode;
      private Status status;




      //Sign-Up
      public boolean saveuser(){
              boolean flag=false;
            try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
                  String query="insert into users (name,email,password,pic,verification_code)value(?,?,?,?,?)";
                  PreparedStatement ps=con.prepareStatement(query);
                  ps.setString(1,name);
                  ps.setString(2,email);
                   ps.setString(3,password);
                  ps.setString(4,pic);
                    ps.setString(5,verificationCode);
                int val=ps.executeUpdate();
                  if(val == 1){
                        flag=true;
                  }

                  con.close();
            }catch(ClassNotFoundException | SQLException e){
                  e.printStackTrace();
            }
            return flag;
      }

           
            //Sign-In
          public void signin(){
               try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
            String query="select * from users where password=? and email=?";

             PreparedStatement ps=con.prepareStatement(query);
             ps.setString(1,password);
             ps.setString(2,email);
             ResultSet  rs=ps.executeQuery();
             if(rs.next()){
               userId=rs.getInt("user_id");
               name=rs.getString("name");
               pic=rs.getString("pic");
             }
             con.close();
               }catch(SQLException | ClassNotFoundException e){
                    e.printStackTrace();
               }
                   
            }


             public void setemail(String email){
                 this.email=email;
            }
             public String getemail(){
                 return email;
            }

 
            
             public void setname(String name){
                 this.name=name;
            }
             public  String getname(){
                 return name;
            }


            
             public void setpassword(String password ){
                 this.password=password;
            }
             public String getpassword(){
                 return password;
            }
            
            
            public void setpic(String pic){
                 this.pic=pic;
            }
             public  String getpic(){
                 return pic;
            }

      
   
    public Integer getuserId() {
        return userId;
    }

    
    public void setuserId(Integer userId) {
        this.userId = userId;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    
    public Status getStatus() {
        return status;
    }

    
    public void setStatus(Status status) {
        this.status = status;
    }
}

       
      




