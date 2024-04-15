package JavaBasico.AulasUm.AulasDois;

import javax.swing.*;

public class Triangulos {
    public static void main(String[] args) {
        Double ladoUm = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga o primeiro lado: "));
        Double ladoDois = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga o segundo lado: "));
        Double ladoTres = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga o terceiro lado: "));

        if (ladoUm <= 0 || ladoDois <= 0 || ladoTres <= 0) {
            JOptionPane.showMessageDialog(null, "Triângulo inválido. Lados devem ser positivos.");
        } else if (ladoUm + ladoDois <= ladoTres || ladoUm + ladoTres <= ladoDois || ladoDois + ladoTres <= ladoUm) {
            JOptionPane.showMessageDialog(null, "Triângulo inválido. Não atende à condição de desigualdade triangular.");
        } else if (ladoUm.equals(ladoDois) && ladoUm.equals(ladoTres)) {
            JOptionPane.showMessageDialog(null, "Temos um triângulo equilátero.");
        } else if (ladoUm.equals(ladoDois) || ladoUm.equals(ladoTres) || ladoDois.equals(ladoTres)) {
            JOptionPane.showMessageDialog(null, "Temos um triângulo isósceles.");
        } else {
            JOptionPane.showMessageDialog(null, "Temos um triângulo escaleno.");
        }
    }
}
