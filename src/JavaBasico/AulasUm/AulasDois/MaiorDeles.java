package JavaBasico.AulasUm.AulasDois;

import javax.swing.*;

public class MaiorDeles {
    public static void main(String[] args) {

        Double primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga o primeiro número: "));
        Double segundoNumero = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga o segundo número: "));
        Double terceiroNumero = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga o terceiro número: "));

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            JOptionPane.showMessageDialog(null, "O número maior foi o primeiro: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            JOptionPane.showMessageDialog(null, "O número maior foi o segundo: " + segundoNumero);
        } else {
            JOptionPane.showMessageDialog(null, "O número maior foi o terceiro: " + terceiroNumero);
        }
    }
}
