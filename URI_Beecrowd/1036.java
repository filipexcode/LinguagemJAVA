import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner leitor = new Scanner(System.in);
     
     double a = leitor.nextDouble();
     double b = leitor.nextDouble();
     double c = leitor.nextDouble();
   
   
       if(((b * b) - 4 * a * c) < 0 || a == 0){
            System.out.println("Impossivel calcular");
       }else{
           double t = Math.sqrt((b*b)-4*a*c);
           double r1 = ((-b + t) / (2 * a));
           double r2 = ((-b - t) / (2 * a));
           
           System.out.println(String.format("R1 = %.5f",r1));
           System.out.println(String.format("R2 = %.5f",r2));
           
       }
       
        }
 
}
