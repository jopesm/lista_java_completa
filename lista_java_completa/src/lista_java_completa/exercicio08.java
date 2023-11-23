package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio08 {

    public static void main(String[] args) {

        String numero1, numero2, operacao;
        float n1, n2, resultado;
        int op;

        numero1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        n1 = Float.parseFloat(numero1);

        numero2 = JOptionPane.showInputDialog("Digite o segundo numero");
        n2 = Float.parseFloat(numero2);

        operacao = JOptionPane.showInputDialog("1. Adição\r\n"
                + "2. Subtração\r\n"
                + "3. Multiplicação\r\n"
                + "4. Divisão");
        op = Integer.parseInt(operacao);

        JOptionPane.showMessageDialog(null, "Operação: " + op);

        switch (op) {
            case 1:
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Entrada inválida");
        }
    }
}
