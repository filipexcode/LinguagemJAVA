/*Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.*/
  
  
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int cont = 0;
        int n = 0;
        int resultado = 0;
        
        do {
            n = leitor.nextInt();
            
            if (n < 0) {
                break;
            } else {
                resultado += n;
                cont++;
            }
        } while (n > 0);
        
        double media = (double) resultado / cont;
        
        System.out.printf("%.2f\n", media);
 
    }
 
}
