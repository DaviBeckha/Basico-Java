package JavaBasico.AulasUm.AulasEstruDeRepe.For;

import java.util.Scanner;

public class DentroEFora {
    public static void main(String[] args) {
        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe a quantidade de números a verificar: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o próximo número: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println("Números dentro do intervalo [10, 20]: " + in);
        System.out.println("Números fora do intervalo [10, 20]: " + out);

        sc.close();
    }
}
