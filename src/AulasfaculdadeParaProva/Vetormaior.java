package AulasfaculdadeParaProva;

import javax.swing.*;

public class Vetormaior {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int maior = 0, menor = 0;

        for (int i=0;i<vetor.length;i++) {
            vetor[i] = Integer.parseInt(JOptionPane
                    .showInputDialog(null, "Informe um n�mero: "));
        }

        maior = vetor[0];
        menor = vetor[0];

        for (int i=1;i<vetor.length;i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Maior � " + maior);
        JOptionPane.showMessageDialog(null, "Menor � " + menor);

    }

}



