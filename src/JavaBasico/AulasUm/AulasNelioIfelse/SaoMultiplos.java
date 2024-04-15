package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class SaoMultiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga um número inteiro: "); // queremos saber se são múltiplos ou não.
        int primeiroNumero = sc.nextInt();

        System.out.println("Diga o segundo número: ");
        int segundoNumero = sc.nextInt();


        if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
