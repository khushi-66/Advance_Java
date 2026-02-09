public class F{
    public static void main(String[]args){

        String str="348947289dshigshdfkjxcg7462i798h9u8978hg78g8g8g7878";
       StringBuilder str2=new StringBuilder();
        for(int i=0; i<6;i++){
            int index=(int)(Math.random()*str.length());
          str2.append(str.charAt(index));
              
        }
        System.out.println(  str2);
    }
} 
 
 
    

