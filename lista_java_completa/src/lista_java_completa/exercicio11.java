package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio11 {

    public static void main(String[] args) {
        String numero;
        int nro, i, v;

        numero = JOptionPane.showInputDialog("Digite um numero inicial");
        nro = Integer.parseInt(numero);

        int[] vetor = new int[nro];

        i = nro;
        v = 0;

        while (i > 0) {
            vetor[v] = i;

            v = v + 1;
            i--;
        }

        StringBuilder mensagem = new StringBuilder("Valores do vetor:\n");
        for (int valor : vetor) {
            mensagem.append(valor).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}

