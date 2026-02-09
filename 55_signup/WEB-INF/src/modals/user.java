package modals;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
public class user{
     private Integer userId;
      private String name;
      private String email;
      private String password;
      private String pic;
      
      public boolean saveuser(){
              boolean flag=false;
            try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
                  String query="insert into users (name,email,password,pic)value(?,?,?,?)";
                  PreparedStatement ps=con.prepareStatement(query);
                  ps.setString(1,name);
                  ps.setString(2,email);
                   ps.setString(3,password);
                  ps.setString(4,pic);

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

            public void setuserId(Integer userId){
                 this.userId=userId;
            }
             public   Integer getuserId(){
                 return userId;
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

      }
       
      




