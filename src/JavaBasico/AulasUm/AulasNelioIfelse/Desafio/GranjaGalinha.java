package JavaBasico.AulasUm.AulasNelioIfelse.Desafio;

import javax.swing.*;

public class GranjaGalinha {
    public static void main(String[] args) {
        //A Granja Galinha Feliz está com uma promoção imperdível:
        // Um ovo por RS 1,50! Você compra 6 ovos e só paga 6 reais! A dúzia custa 10 reais! Já a bandeja com 30 ovos está custando 21 reais!
        // Faça um programa que pergunte ao usuário a quantidade de ovos que ele deseja comprar e informe o valor a ser pago,
        // respeitando a tabela acima. O cliente sempre deve pagar o mais barato possível, aproveitando as promoções por quantidade.
        // Ex.: O usuário deseja 15 ovos, então pagará o equivalente a 1 dúzia + 3 ovos avulsos = 10,00 + 4,50 = R$ 14,50;
        // Ex1.: O usuário deseja 54 ovos, então pagará o equivalente a 1 bandeja + 2 dúzias = 21,00 + 20,00 = 41 reais.

        Integer ovos = Integer.valueOf(JOptionPane.showInputDialog(null, "Quantos ovos?"));
        Integer novosOvos = 0;
        Integer ovoSeis = 6;
        Double duzia = 10.00;
        Double bandeija = 21.00;
        Double valorAbsoluto = 0.00;

        if (ovos == 6) {

            valorAbsoluto = valorAbsoluto + ovoSeis;

        } else if (ovos < 12) {

            valorAbsoluto = ovos * 1.50;

        } else if (ovos == 12) {
            valorAbsoluto = duzia;

        } else if (ovos > 12 && ovos < 30) {

            valorAbsoluto = ovos / 12 * duzia;
            novosOvos = ovos % 12;
            valorAbsoluto = valorAbsoluto + (novosOvos * 1.50);

        } else if (ovos == 30) {

            valorAbsoluto = bandeija;

        } else if (ovos > 30) {

            valorAbsoluto = (ovos / 30 * bandeija);
            novosOvos = (ovos % 30);
            valorAbsoluto = valorAbsoluto + (novosOvos / 12 * duzia);
            novosOvos = (novosOvos % 12);
            valorAbsoluto = valorAbsoluto + (novosOvos * 1.50);

        }
        JOptionPane.showMessageDialog(null, "Preço a se pagar: " + valorAbsoluto);
    }
}
