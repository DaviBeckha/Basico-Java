package AulasfaculdadeParaProva;

import javax.swing.*;

public class Vetorfixo {
    public static void main(String[] args) {

    int vetor[] = new int[6];

    vetor[0] = 1;
    vetor[1] = 0;
    vetor[2] = 5;
    vetor[3] = -2;
    vetor[4] = -5;
    vetor[5] = 7;

    //int vetor2[] = {1, 0, 5, -2, -5, 7};

    int soma = vetor[0] + vetor[1] + vetor[5];

		JOptionPane.showMessageDialog(null, "Soma = " + soma);

    vetor[4] = 100;

    String mensagem = "";
		for(int i=0;i<6;i++) {
        mensagem += vetor[i] + "\n";
    }

		JOptionPane.showMessageDialog(null, mensagem);

}

}

