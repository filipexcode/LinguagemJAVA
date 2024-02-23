import java.io.IOException;
import java.util.Scanner;


public class Main {
 
 
    public static Double pi = 3.14159;
    
    public static void main(String[] args) throws IOException {
 
      Scanner leitor = new Scanner(System.in);
      
      double raio = leitor.nextDouble();
      
      
      double volume = (4 / 3.0) * pi * Math.pow(raio, 3.0);
      
      System.out.println(String.format("VOLUME = %.3f", volume));
 
    }
 
}
