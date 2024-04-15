package JavaBasico.AulasUm.AulasEstruDeRepe.For;

import java.util.Scanner;

public class Seusdivisores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga um número para mostrar seu divisores");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
