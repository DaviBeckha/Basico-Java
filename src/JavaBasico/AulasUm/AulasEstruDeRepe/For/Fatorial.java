package JavaBasico.AulasUm.AulasEstruDeRepe.For;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o número para fatorial");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <=n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
