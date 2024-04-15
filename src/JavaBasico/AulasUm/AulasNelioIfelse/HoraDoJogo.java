package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class HoraDoJogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o horário que o jogo começou: ");
        int horarioInicial = sc.nextInt();

        System.out.println("Diga o horário que o jogo acabou: ");
        int horarioFinal = sc.nextInt();

        int duracaoTotal;

        if (horarioInicial < horarioFinal) {
            duracaoTotal = horarioFinal - horarioInicial;
        }
        else {
            duracaoTotal = 24 - horarioInicial + horarioFinal;
        }

        System.out.println("O jogo durou " + duracaoTotal + " horas");

        sc.close();
    }
}
