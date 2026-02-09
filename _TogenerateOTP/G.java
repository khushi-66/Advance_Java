public class G{
    public static void main(String[]args){

        String str="0123456789";
       StringBuilder str2=new StringBuilder();
        for(int i=0; i<6;i++){
            int index=(int)(Math.random()*str.length());
          str2.append(str.charAt(index));
              
        }
        System.out.println(  str2);
    }
} 
 