package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio13 {

    public static void main(String[] args) {
        String tamanho, valor;
        int tam, val;

        tamanho = JOptionPane.showInputDialog("Digite o tamanho de elementos do vetor");
        tam = Integer.parseInt(tamanho);

        int[] vetor1 = new int[tam];
        int[] vetor2 = new int[tam];
        int[] vetor_soma = new int[tam];

        JOptionPane.showMessageDialog(null, "Digite os elementos do primeiro vetor");

        for (int i = 0; i < tam; i++) {
            valor = JOptionPane.showInputDialog("Elemento " + (i + 1));
            val = Integer.parseInt(valor);
            vetor1[i] = val;
        }

        JOptionPane.showMessageDialog(null, "Digite os elementos do segundo vetor");

        for (int i = 0; i < tam; i++) {
            valor = JOptionPane.showInputDialog("Elemento " + (i + 1));
            val = Integer.parseInt(valor);
            vetor2[i] = val;
        }

        for (int i = 0; i < tam; i++) {
            vetor_soma[i] = vetor1[i] + vetor2[i];
        }

     
        StringBuilder mensagem = new StringBuilder("A soma dos vetores é: [");
        for (int i = 0; i < tam; i++) {
            mensagem.append(vetor_soma[i]);
            if (i < tam - 1) {
                mensagem.append(", ");
            }
        }
        mensagem.append("]");

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}

