package JavaBasico.AulasUm.AulasDois;

import javax.swing.*;

public class Vogalounao {
    public static void main(String[] args) {
        //Dada uma letra, mostre se essa letra é ou não uma vogal (pode considerar
        //apenas letras minúsculas).

        String input = JOptionPane.showInputDialog(null, "Digite uma letra:");
        char letra = input.toLowerCase().charAt(0);  // Converte a entrada para minúsculas

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            JOptionPane.showMessageDialog(null, letra + " é uma vogal.");
        } else {
            JOptionPane.showMessageDialog(null, letra + " não é uma vogal.");
        }
    }
}
