package AulasfaculdadeParaProva;

import javax.swing.*;

public class Invertidos {
    public static void main(String[] args) {
        int invertido[] = new int[10];

        for (int i=0;i<10;i++) {
            invertido[i] = Integer.parseInt(JOptionPane
                    .showInputDialog(null, "Informe um n�mero: "));
        }

        for (int i=9;i>=0;i--) {
            JOptionPane.showMessageDialog(null, invertido[i]);
        }

    }

}

