package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio12 {

    public static void main(String[] args) {

        String numero;
        String[] vetor_operacao = new String[11];

        numero = JOptionPane.showInputDialog("Digite um numero para a tabela de multiplicação");
        vetor_operacao[0] = "Tabela de multiplicação para " + numero + ":";

        for (int i = 1; i < 11; i++) {
            int resultado = Integer.parseInt(numero) * i;
            vetor_operacao[i] = numero + " x " + i + " = " + resultado;
        }

        StringBuilder mensagem = new StringBuilder("Valores do vetor:\n");
        for (String valor : vetor_operacao) {
            mensagem.append(valor).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
