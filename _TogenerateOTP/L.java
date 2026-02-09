public class L{
    public static void main(String[]args){

        String str="0123456789";

        for(int i=0;i<100;i++){
         StringBuilder str2=new StringBuilder();
        for(int j=0; j<6;j++){
            int index=(int)(Math.random()*str.length());
            while(j==0 && index ==0){
                index=(int)(Math.random()*str.length());
            }
          str2.append(str.charAt(index));
              
        }
        System.out.println(  str2);   
        }
       
    }
} 
 