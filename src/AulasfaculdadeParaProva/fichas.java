package AulasfaculdadeParaProva;

import javax.swing.*;

public class fichas {
    public static void main(String[] args) {

        int somaIdade = 0, idade, qtdePessoa = 150;

        for (int i = 0; i < qtdePessoa; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade da pessoa " + (i + 1) + ":'"));
            somaIdade += idade;
        }

        double mediaIdade = somaIdade / qtdePessoa;

        JOptionPane.showMessageDialog(null, "A m�dia de idade das " + qtdePessoa + " pessoas �: " + mediaIdade);

    }
}



