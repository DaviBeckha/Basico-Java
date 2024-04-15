package JavaBasico.AulasUm.AulasDois;

import javax.swing.*;

public class DataCerta {
    public static void main(String[] args) {
        //Escreva um algoritmo que, dadas duas datas, determine qual delas ocorreu
        //cronologicamente primeiro. Cada data é composta de 3 números inteiros, um
        //representando o dia, outro o mês e outro o ano
        JOptionPane.showMessageDialog(null,"Bom dia iremos comparar as 2 datas e ver qual dela veio " +
                "cronologicamente primeiro ");
        Integer primeiraDataAno = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a primeira data (ano da data): "));
        Integer primeiraDataMes = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o mês da primeira data "));
        Integer primeiraDataDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o dia da primeira data"));
        // acima disso é a busca para primeira data

        Integer segundaDataAno = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a segunda data (ano da data)"));
        Integer segundaDataMes = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o mês da segunda data "));
        Integer segundaDataDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o dia da segunda data"));

        if (primeiraDataAno > segundaDataAno ) {
            JOptionPane.showMessageDialog(null,"A segunda data veio primeiro! ");
        } else if (segundaDataAno > primeiraDataAno) {
            JOptionPane.showMessageDialog(null,"A primeira data veio primeiro! ");
        } else if (segundaDataMes > primeiraDataMes){
            JOptionPane.showMessageDialog(null,"A segunda data veio primeiro! ");
        } else if (primeiraDataMes > segundaDataMes) {
            JOptionPane.showMessageDialog(null,"A primeira data veio primeiro! ");
        } else if (primeiraDataDias > segundaDataDias) {
            JOptionPane.showMessageDialog(null,"A segunda data veio primeiro! ");
        } else if (primeiraDataDias < segundaDataDias) {
            JOptionPane.showMessageDialog(null,"A primeira data veio primeiro! ");

        }
    }
}
