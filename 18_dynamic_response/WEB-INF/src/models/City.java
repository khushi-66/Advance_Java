package models;


 public class City{
     public  String cityname ;
     public  Integer city_id;
   public  State  state;
     public  City(State state ,String cityname ,int city_id){
         this.cityname=cityname;
         this.city_id=city_id;
         this.state=state; } }