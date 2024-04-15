package JavaBasico.AulasUm.AulasEstruDeRepe.While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Diga vários número ou 0 para cancelar");
        int numero = sc.nextInt();
        int soma = 0;
        while (numero != 0) {

            soma += numero;
            numero = sc.nextInt();
        }
        System.out.println(soma);
    }
}
