package JavaBasico.AulasUm.AulasNelioIfelse;

import javax.swing.*;

public class ForaDeIntervalo {
    public static void main(String[] args) {

        Double numeroIntervalo = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um valor: "));

        if (numeroIntervalo >= 0 && numeroIntervalo <= 25) {
            JOptionPane.showMessageDialog(null,"Intervalo de 0  e 25");
        } else if (numeroIntervalo >= 25 && numeroIntervalo <= 50) {
            JOptionPane.showMessageDialog(null,"Intervalo de 25 a 50");
        } else if (numeroIntervalo >= 50 && numeroIntervalo <= 75) {
            JOptionPane.showMessageDialog(null,"Intervalo de 50 e 75");
        } else if (numeroIntervalo >= 75 && numeroIntervalo <= 100) {
            JOptionPane.showMessageDialog(null,"Está no intervalo de 75 a 100");
        }else {
            JOptionPane.showMessageDialog(null,"Fora de intervalo! ");
        }
    }
}
