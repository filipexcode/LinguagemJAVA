import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner leitor = new Scanner(System.in);
      
      int n = leitor.nextInt();
      int i = 1;
      
      for(i=1;i <= n;i++){
          if(i % 2 == 0){
              System.out.println(i + "^2 = " + (i*i));
          }
      }
 
    }
 
}
