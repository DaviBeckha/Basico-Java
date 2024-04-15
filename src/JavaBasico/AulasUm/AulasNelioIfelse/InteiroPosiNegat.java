package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class InteiroPosiNegat {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        Scanner sc = new Scanner(System.in);

        System.out.printf("Poderia dizer um número ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("Não negativo");
        }

        sc.close();
    }
}