package JavaBasico.AulasUm.basico;

import javax.swing.*;

public class falar2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite um nome: ");
        JOptionPane.showMessageDialog(null, "Nome: " + nome);
    }
}
