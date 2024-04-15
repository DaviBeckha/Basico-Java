package JavaBasico.AulasUm.AulasEstruDeRepe.For;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.
        Scanner sc = new Scanner(System.in);

        System.out.println("Começar de qual número");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (i %2 != 0){
                System.out.println("Números impares: "+i);
            } if (i % 2 ==0) {
                System.out.println("Números pares: "+i); // esse trecho fiz de teste e curiosidade
            }

        }
    }
}
