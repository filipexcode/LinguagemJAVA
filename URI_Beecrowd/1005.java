import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner leitor = new Scanner(System.in);
       
       double A = leitor.nextDouble();
       double B = leitor.nextDouble();
       
       double media = ((A*3.5) + (B * 7.5)) / 11;
       
       System.out.println(String.format("MEDIA = %.5f", media));
       
    }
 
}
