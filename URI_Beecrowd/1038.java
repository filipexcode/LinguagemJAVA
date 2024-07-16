/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

CÓDIGO        ESPECIFICAÇÃO        PREÇO
  1           Cachorro Quente      RS 4.00
  2           X-Salada             RS 4.50
  3           X- Bacon             RS 5.00
  4           Torrada simples      RS 2.00
  5           Refrigerante         RS 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        
        int cod = leitor.nextInt();
        int qtd = leitor.nextInt();
        
        if(cod == 1){
            System.out.println(String.format("Total: R$ %.2f",4.00 * qtd));
            }else if(cod == 2){
                System.out.println(String.format("Total: R$ %.2f",4.50 * qtd));
            }else if(cod == 3){
                System.out.println(String.format("Total: R$ %.2f",5.00 * qtd));
            }else if(cod == 4){
                System.out.println(String.format("Total: R$ %.2f",2.00 * qtd));
                }else if(cod == 5){
                    System.out.println(String.format("Total: R$ %.2f",1.5 * qtd));
                }
 
    }
 
}
