package AulasfaculdadeParaProva;

import java.util.Scanner;

public class mediaparesss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Escreva um algoritmo que calcule a média dos números digitados pelo
//usuário, se eles forem pares. Termine a leitura se o usuário digitar zero
//(0).int pares = 0;
        int somaPares = 0;
        int quantidadePares = 0;

        System.out.println("Digite números inteiros. Digite 0 para encerrar a entrada e calcular a média ");

        while (true) {
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            }
        }
            double media = (double) somaPares / quantidadePares;
            System.out.println("A média dos números pares é: " + media);

            sc.close();

        }
}
