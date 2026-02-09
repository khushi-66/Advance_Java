package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Student {
    private String  name ;
    private Integer age;
    private Integer studentId;
    private String college;
    private Float marks;
 
    public void save(){
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
                 String query="insert into students(name,age,college,marks)value (?,?,?,?)";
                 PreparedStatement ps =con.prepareStatement(query);
                 ps.setString(1,name);
                 ps.setInt(2,age);
                 ps.setString(3,college);
                 ps.setFloat(4,marks);
                 ps.executeUpdate();
                 con.close();
             } catch (SQLException |ClassNotFoundException e) {
                e.printStackTrace();
             }
    }



    public  static  ArrayList<Student>  show_All_Data(){
        ArrayList <Student>students=new ArrayList<>();
        
try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
                 String query="select * from students;";
                 PreparedStatement ps =con.prepareStatement(query);
                    
                  ResultSet rs=ps.executeQuery();
                     while(rs.next()){
                        Student st=new Student();
                   st.studentId=rs.getInt("student_Id");
               st.name= rs.getString("name");
             st.college=rs.getString("college");
             st.marks=rs.getFloat("marks");
              st.age=rs.getInt("age");
                      students.add(st);
                     }
                     

                 con.close();
             } catch (SQLException |ClassNotFoundException e) {
                e.printStackTrace();
             }
    

        return students;
    }

    public static void  delete( Integer studentId){
   try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
                 String query="delete from students where student_id=?";
                 PreparedStatement ps =con.prepareStatement(query);
                 ps.setInt(1,studentId);
                 
                 ps.executeUpdate();
                 con.close();
             } catch (SQLException |ClassNotFoundException e) {
                e.printStackTrace();
             }
    }



    public  void fetch(){
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
       String query="select * from students where student_id=?";
       PreparedStatement ps=con.prepareStatement(query);
       ps.setInt(1,studentId);
       ResultSet rs=ps.executeQuery();
       if(rs.next()){
        name=rs.getString("name");
        age=rs.getInt("age");
         marks=rs.getFloat("marks");
        college=rs.getString("college");

       }
       con.close();
        }
        catch(SQLException |ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public void update(){
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");
            String query = "update students set name=? ,college=? ,age=?,marks=? where student_id=?";
             PreparedStatement ps=con.prepareStatement(query);
             ps.setString(1,name);
             ps.setString(2,college);
             ps.setInt(3,age);
             ps.setFloat(4,marks);
             ps.setInt(5,studentId);
             ps.executeUpdate();

      con.close();
           } catch (SQLException|ClassNotFoundException e) {
            e.printStackTrace();
           }




    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public Float getMarks() {
        return marks;
    }
    public void setMarks(Float marks) {
        this.marks = marks;
    }


}
