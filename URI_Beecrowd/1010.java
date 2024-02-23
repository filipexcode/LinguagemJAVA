import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int codPeca1 = leitor.nextInt();
        int qtdPeca1 = leitor.nextInt();
        double valuePeca1 = leitor.nextDouble();
        
        int codPeca2 = leitor.nextInt();
        int qtdPeca2 = leitor.nextInt();
        double valuePeca2 = leitor.nextDouble();
        
        double valueToPay = (qtdPeca1 * valuePeca1) + (qtdPeca2 * valuePeca2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valueToPay));
    }
 
}
