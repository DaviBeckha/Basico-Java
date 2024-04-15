package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class ImparouPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Diga um número para sabermos se será par ou impár: ");
        int imparOuPar = sc.nextInt();

        if (imparOuPar % 2 == 0 ) {
            System.out.println("Par ");
        } else {
            System.out.println("Ímpar ");
        }
    }
}
