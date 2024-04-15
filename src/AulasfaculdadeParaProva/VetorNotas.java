package AulasfaculdadeParaProva;

import javax.swing.*;

public class VetorNotas {
    public static void main(String[] args) {
        int tamanhoVetor = 4;

        double n1[] = new double[tamanhoVetor];
        double n2[] = new double[tamanhoVetor];
        double n3[] = new double[tamanhoVetor];
        String alunos[] = new String[tamanhoVetor];
        double media[] = new double[tamanhoVetor];

        for(int i=0;i<tamanhoVetor;i++) {
            alunos[i] = JOptionPane.showInputDialog(null, "Informe o nome: ");
            n1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota 1 do aluno " + alunos[i] + ": "));
            n2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota 2 do aluno " + alunos[i] + ": "));
            n3[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nota 3 do aluno " + alunos[i] + ": "));
        }

        for(int i=0;i<tamanhoVetor;i++) {
            media[i] = (n1[i] + n2[i] + n3[i]) / 3;
        }

        String msg = "";
        for(int i=0;i<tamanhoVetor;i++) {

            msg += "Aluno: " + alunos[i] + " - N1: " + n1[i] +
                    " - N2: " + n2[i] + " - N3: " + n3[i] +
                    " - M�dia: " + media[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);

    }

}

