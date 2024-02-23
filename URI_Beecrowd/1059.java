import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int i = 0;
       
       for(i = 0;i <= 100;i++){
           if(i % 2 == 0 && i > 1){
               System.out.println(i);
           }
       }
 
    }
 
}
