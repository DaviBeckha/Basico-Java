package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class MenuDeProdutos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcaoEscolhaMenu = -1;

        do {
            System.out.println("Aqui está um pouco de nosso cardápio\n" +
                    "Código     Alimento     Preço\n" +
                    "  1        Dogão         R$4,00\n" +
                    "  2        X-salada      R$ 4,50\n" +
                    "  3        X-Bacon       R$ 5,00\n" +
                    "  4        Torradinha    R$ 2,00\n" +
                    "  5        Refrigerante  R$ 1,50\n" +
                    "Poderia digitar o código do produto desejado (ou 0 para sair): ");

            int codigoProduto = sc.nextInt();

            if (codigoProduto == 0) {
                break; // se botar 0 fecha o loop
            }

            System.out.println("Poderia me dizer quantidade que deseja: ");
            int quantidadeProduto = sc.nextInt();

            switch (codigoProduto) {
                case 1:
                    System.out.println("Você pediu " + quantidadeProduto + " Dogão, ao total sai R$" + quantidadeProduto * 4.00);
                    break;

                case 2:
                    System.out.println("Você pediu " + quantidadeProduto + " X-salada, ao total sai R$" + quantidadeProduto * 4.50);
                    break;

                case 3:
                    System.out.println("Você pediu " + quantidadeProduto + " X-Bacon, ao total sai R$" + quantidadeProduto * 5.00);
                    break;

                case 4:
                    System.out.println("Você pediu " + quantidadeProduto + " Torradinha, ao total sai R$" + quantidadeProduto * 2.00);
                    break;

                case 5:
                    System.out.println("Você pediu " + quantidadeProduto + " Refrigerante, ao total sai R$" + quantidadeProduto * 1.50);
                    break;

            }

        } while (opcaoEscolhaMenu != 0);

        System.out.println("Obrigado por fazer o pedido!");
    }
}
