package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio01 {

    public static void main(String[] args) {

        String valor_conta;
        String valor_porcentagem;
        float v1, v2, gorjeta, total;

        valor_conta = JOptionPane.showInputDialog("Digite o valor total da conta");
        valor_porcentagem = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar");

        v1 = Float.parseFloat(valor_conta);
        v2 = Float.parseFloat(valor_porcentagem);

        gorjeta = (v1 * v2 / 100);
        total = v1 + gorjeta;

        JOptionPane.showMessageDialog(null, "Valor da gorjeta: " + gorjeta);
        JOptionPane.showMessageDialog(null, "Valor total com gorjeta: " + total);

    }

}