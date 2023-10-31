import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int t = leitor.nextInt();
        int vm = leitor.nextInt();
        
        double km = vm * t;
        double media = km / 12;
        
        System.out.println(String.format("%.3f",media));
 
    }
 
}
