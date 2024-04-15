package JavaBasico.AulasUm.AulasEstruDeRepe.For;

import java.util.Scanner;

public class Divisão {
    public static void main(String[] args) {
        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        Scanner sc = new Scanner(System.in);


        System.out.println("Diga uma quantidade de números em par");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            double x = sc.nextInt();
            double y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisão impossível");
            }
            else {
                double div = x/y;
                System.out.printf("%.1f%n", div);

            }
        }

        sc.close();
    }
}
