package JavaBasico.AulasUm.AulasDois;

import javax.swing.*;

public class OrdemCrescente {
    public static void main(String[] args) {
        //Escreva um algoritmo que lê três números inteiros e os mostre em ordem
        //crescente.

        Integer a = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga o primeiro número: "));
        Integer b = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga o segundo número: "));
        Integer c = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga o terceiro número: "));

        if (a <= b && b <= c) {
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + a + " " + b + " " + c);
        } else if (a <= c && c <= b) {
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + a + " " + c + " " + b);
        } else if (b <= a && a <= c) {
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + b + " " + a + " " + c);
        } else if (b <= c && c <= a) {
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + b + " " + c + " " + a);
        } else if (c <= a && a <= b) {
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + c + " " + a + " " + b);
        } else {
            JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + c + " " + b + " " + a);
        }
    }
}

