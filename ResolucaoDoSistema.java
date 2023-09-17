package com.mycompany.resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolucao do sistema e: "+ d.width +"X" + d.height);
    }
}
