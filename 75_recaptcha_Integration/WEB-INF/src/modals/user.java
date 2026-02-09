package modals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jasypt.util.password.StrongPasswordEncryptor;
public class user{
     private Integer userId;
      private String name;
      private String email;
      private String password;
      private String pic;
      private String verificationCode;
      private Status status;

    private String phone;
    static StrongPasswordEncryptor spe=new StrongPasswordEncryptor();
       //verify account.......
         public static boolean verifyAccount(String email,String verificationcode){
            boolean flag=false;

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ stationarydb?user=root&password=1234");

            String query = "update users set verification_code=?, status_id=? where email=? and verification_code=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, null);
            ps.setInt(2, Status.ACTIVE.getStatusId());
            ps.setString(3, email);
            ps.setString(4, verificationcode);

            int val = ps.executeUpdate();

            if(val == 1) 
                flag = true;

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

            
            return flag;
         }


      //Sign-Up
      public boolean saveuser(){
              boolean flag=false;
            try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
                  String query="insert into users (name,email,password,pic,verification_code,phone)value(?,?,?,?,?,?)";
                  PreparedStatement ps=con.prepareStatement(query);
                  ps.setString(1,name);
                  ps.setString(2,email);
                   ps.setString(3,spe.encryptPassword(password));
                  ps.setString(4,pic);
                    ps.setString(5,verificationCode);
                    ps.setString(6,phone);
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
          public boolean signin(){
            boolean flag=false;
               try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationarydb?user=root&password=1234");
            String query="select user_id,password,name,pic,status_id,phone from users where email=?";

             PreparedStatement ps=con.prepareStatement(query);
             
             ps.setString(1,email);
             ResultSet  rs=ps.executeQuery();
             if(rs.next()){
                 if(spe.checkPassword(password,rs.getString("password"))){

                 
               userId=rs.getInt("user_id");
               name=rs.getString("name");
               pic=rs.getString("pic");
               int stid=rs.getInt("status_id");
               status=stid==1?Status.INACTIVE:stid==2?Status.ACTIVE:stid==3?Status.BLOCKED:Status.CLOSED;
               phone=rs.getString("phone");
               flag=true;
                }
             }
             con.close();
               }catch(SQLException | ClassNotFoundException e){
                    e.printStackTrace();
               }
                  return flag; 
            }


             public void setemail(String email){
                 this.email=email;
            }
             public String getemail(){
                 return email;
            }

  public void setphone(String phone){
                 this.phone=phone;
            }
             public String getphone(){
                 return phone;
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

       
      




