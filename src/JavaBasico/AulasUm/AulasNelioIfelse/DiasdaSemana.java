package JavaBasico.AulasUm.AulasNelioIfelse;

import java.util.Scanner;

public class DiasdaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga um dia da semana de 1 a 7 ");
        int diaNumerado = sc.nextInt();

        String dia = "";


        switch (diaNumerado) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
        System.out.println("Dia da semana é :" + dia);
    }
}
