package AulasfaculdadeParaProva;

import javax.swing.*;

public class Vetornegativo {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int vetor2[] = new int[10];

        for (int i=0;i<10;i++) {
            vetor[i] = Integer.parseInt(JOptionPane
                    .showInputDialog(null, "Informe um n�mero: "));
        }

        for (int i=0;i<10;i++) {
            if (vetor[i] < 0) {
                vetor2[i] = 1;
            }else {
                vetor2[i] = vetor[i];
            }
        }

        String msg = "";
        for (int i=0;i<10;i++) {
            msg += vetor2[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);

    }

}

