package JavaBasico.AulasUm.AulasEstruDeRepe.For.Desafio;

import javax.swing.*;

public class CaixaLetrada {
    public static void main(String[] args) {

        Integer n = Integer.parseInt(JOptionPane.showInputDialog(null," Diga um número"));

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) { // fazer as quebras de linhas
                System.out.print(" ");
                if(j == i) {
                    System.out.print(j);
                } else if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else if ( j != i ) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}


