import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int num = leitor.nextInt();
        int qtdhr = leitor.nextInt();
        double val = leitor.nextDouble();
        
        double sal = qtdhr * val;
        
        System.out.println("NUMBER = " + num);
        System.out.println(String.format("SALARY = U$ %.2f",sal));
 
    }
 
}
