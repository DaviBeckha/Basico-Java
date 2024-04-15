package JavaBasico.AulasUm.AulasDois;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Bem vindo ao nosso restaurante.\n" +
                        "Por favor escolha seu pedido !");

        int opcaoEscolhaMenu = -1;
        do {
            opcaoEscolhaMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n" +
                    "1 - Miojo da casa\n" +
                    "2 - Ensopado de carne\n" +
                    "3 - Sanduiche de presunto\n" +
                    "4 - Pão com ovo\n" +
                    "5 - Macarrão com carne\n" +
                    "6 - Sair"));

            switch (opcaoEscolhaMenu) {
                case 1: // miojão
                    JOptionPane.showMessageDialog(null,"*Miojo da casa*\n" +
                            "Miojo lámen sabor carne\n" +
                            "Botado em uma panela com água quente\n" +
                            "Aguardemos 5 minutos\n" +
                            "Após fervimento total está pronto ! \n");
                    break;

                case 2: // Ensopado de carne

                    JOptionPane.showMessageDialog(null,"*Ensopado de carne*\n" +
                            "Panela de pressão com água fervente\n" +
                            "Colocamos músculo picado\n" +
                            "Temperos da casa\n" +
                            "Colocamos alguns legumes\n");
                    break;

                case 3: // sanduba de presunto
                    JOptionPane.showMessageDialog(null,"*Sanduíche de Presunto*\n" +
                            "Pão d'agua\n" +
                            "Muito presunto\n");
                    break;

                case 4: // pão com ovo
                    JOptionPane.showMessageDialog(null,"*Pão com ovo*\n" +
                            "Pão na chapa com manteiga\n" +
                            "2 ovos fritos\n");

                case 5:  //macarrao com carne
                    JOptionPane.showMessageDialog(null,"*Macarrão com carne*\n" +
                            "Macarrão parafuso\n" +
                            "300g de carne patinho");

            }
        } while (opcaoEscolhaMenu != 6);
    }
}
//Escreva um algoritmo que mostre na tela um menu de pratos (pelo menos 5),
//cada um associado a um número.
//Prato 1 - Miojo
//Prato 2 – Ensopado
//Quando um número é selecionado, o programa deve exibir uma breve
//descrição do prato.
