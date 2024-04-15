package JavaBasico.AulasUm.basico;

import javax.swing.*;

public class adicaosubtracao {
    public static void main(String[] args) {

        double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para calcular: "));
        double segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número para calcular: "));
        JOptionPane.showMessageDialog(null, "O resultado é "+ (primeiroNumero + segundoNumero) + ":");
    }
}
