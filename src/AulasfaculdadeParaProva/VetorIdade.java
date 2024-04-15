package AulasfaculdadeParaProva;

import javax.swing.*;

public class VetorIdade {
    public static void main(String[] args) {
        int idades[] = new int[5];

        for (int i=0;i<5;i++) {
            int idadeInformada = Integer.parseInt(JOptionPane
                    .showInputDialog(null, "Informe a idade do aluno " + (i+1) + ": "));

            idades[i] = idadeInformada;
        }

        int somaIdade = 0;

        for (int i=4;i>=0;i--) {
            int idadeAluno = idades[i];

            somaIdade += idadeAluno;

        }

        //double mediaIdade = somaIdade / 5;





    }

}

