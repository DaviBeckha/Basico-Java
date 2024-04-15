package AulasfaculdadeParaProva;

import java.util.Scanner;

public class Tabuada {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número entre 1 e 10: ");
            int numero = sc.nextInt();

            if (numero >= 1 && numero <= 10) {
                System.out.println("Tabuada do " + numero + ":");

                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
            } else {
                System.out.println("Número fora do intervalo de 1 a 10.");
            }

            sc.close();
        }
    }



