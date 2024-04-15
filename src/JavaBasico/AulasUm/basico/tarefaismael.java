package JavaBasico.AulasUm.basico;

import javax.swing.JOptionPane;

public class tarefaismael {
    public static void main(String[] args) {
        /* Peça a unidade em pés e faça as conversões
         *  1 pé = 12 polegadas
         *  1 jarda = 3 pés
         *  1 milha = 1760 jardas.                                    */

        Double pes = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de pés"));


        int opcaoEscolhaMenu = -1;
        do {
            opcaoEscolhaMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n" +
                    "1 -  pé em polegadas\n" +
                    "2 -  pé em jarda\n" +
                    "3 -  pé em milhas\n" +
                    "4 -  Sair\n"));
            switch (opcaoEscolhaMenu) {
                case 1:
                    double pesPolegada = ( pes * 12 );  // pés são multiplicados por 12
                    JOptionPane.showMessageDialog(null, "Pés em polegadas: " + pesPolegada);

                    break;

                case 2:
                    double pesJardas = ( pes/3 );  // pés são dividos por 3
                    JOptionPane.showMessageDialog(null, "Quantidade de pés em jardas: " + pesJardas);

                    break;

                case 3:     // Só para destacar 1 milha é igual a = 5280 pés
                    double pesMilhas = ( pes/5280 );
                    JOptionPane.showMessageDialog(null,"A quantidade de pés em milhas: " + pesMilhas);

            }
        } while (opcaoEscolhaMenu != 4);
    }
}




