package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class TaxasTelefonicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos foram utilizados: ");
        int minutosUsados = sc.nextInt();

        if (minutosUsados <= 100) {
            System.out.println("Você terá que pegar R$50,00");
        } else if (minutosUsados > 100) {
            int acrescimoNoPagamento = (minutosUsados - 100);

            System.out.println("Você terá que pagar a mais : " + ((acrescimoNoPagamento * 2) + (50)));
        }
    }
}
