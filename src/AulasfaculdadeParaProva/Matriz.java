package AulasfaculdadeParaProva;

import javax.swing.*;

public class Matriz {
    public static void main(String[] args) {
        String dados[][] = new String[5][4];//colunas: nome, endereco, bairro, cidade

        for (int i=0;i<5;i++) {
            String nome = JOptionPane.showInputDialog(null, "Informe o nome (" + (i+1) + "): ");
            String endereco = JOptionPane.showInputDialog(null, "Informe o endereco (" + (i+1) + "): ");
            String bairro = JOptionPane.showInputDialog(null, "Informe o bairro (" + (i+1) + "): ");
            String cidade = JOptionPane.showInputDialog(null, "Informe o cidade (" + (i+1) + "): ");

            dados[i][0] = nome;
            dados[i][1] = endereco;
            dados[i][2] = bairro;
            dados[i][3] = cidade;
        }

        String msg = "";
        for (int i=0;i<5;i++) {
            String nomeInformado = dados[i][0];
            String enderecoInformado = dados[i][1];
            String bairroInformado = dados[i][2];
            String cidadeInformada = dados[i][3];

            msg += "Nome: " + nomeInformado
                    + " - Endere�o: " + enderecoInformado
                    + " - Bairro: " + bairroInformado
                    + " - Cidade: " + cidadeInformada + "\n";

        }

        JOptionPane.showMessageDialog(null, msg);

    }

}


