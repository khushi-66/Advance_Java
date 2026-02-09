package models;

public class Student {
   public  String studentname;
   private String studentcollege;
   private Integer studentage;
   private Float studentmarks;
   public Student(String studentname,String studentcollege,Integer studentage,Float studentmarks){
      this.studentage=studentage;
      this.studentcollege=studentcollege;
      this.studentmarks=studentmarks;
      this.studentname=studentname;
  }

    public void setStudentname(String studentname){
       this.studentname=studentname;
    }
    public String getStudentname()
    {
      return studentname;}

      public void setStudentage(Integer studentage){
       this.studentage=studentage;
    }
    public Integer getStudentage()
    {
      return studentage;
    }




    public void setStudentcollege(String studentcollege){
       this.studentcollege=studentcollege;
    }
    public String getStudentcollege()
    {
      return studentcollege;
    }
    
    public void setStudentmarks(String studentmarks){
       this.studentname=studentname;
    }
    public Float getStudentmarks()
    {
      return studentmarks;
   

    }
};

