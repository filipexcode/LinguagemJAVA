package com.mycompany.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual e o seu nome? ");
        String nome = teclado.nextLine();
        
        System.out.print("Qual e a sua nots? ");
        float nota = teclado.nextFloat();
        
//      System.out.println("a nota e " + nota);;
//      System.out.format("a nota do aluno %s e %.2f\n", nome, nota);
        System.out.format("a nota do aluno %s e %.2f\n", nome, nota);
    }
}
