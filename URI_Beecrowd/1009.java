import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
      
        String nome = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double total = ((vendas * 15) / 100) + salarioFixo;
      
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
 
}
