package JavaBasico.AulasUm.AulasNelioIfelse;

import javax.swing.*;

public class IfTernario {
    public static void main(String[] args) {
        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Diga o valor do produto: "));

        Double desconto = (preco < 20.0) ? (preco * 0.1) : (preco * 0.05);

        System.out.println("Valor do produto com desconto sai em : R$" + (preco - desconto));
    }
}
