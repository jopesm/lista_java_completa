package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio14 {

    public static void main(String[] args) {
        String tamanho, valor;
        int tam;
        float val, prod_escalar;

        tamanho = JOptionPane.showInputDialog("Digite o tamanho de elementos do vetor");
        tam = Integer.parseInt(tamanho);

        prod_escalar = 0;
        float[] vetor1 = new float[tam];
        float[] vetor2 = new float[tam];

        JOptionPane.showMessageDialog(null, "Digite os elementos do primeiro vetor");

        for (int i = 0; i < tam; i++) {
            valor = JOptionPane.showInputDialog("Elemento " + (i + 1));
            val = Float.parseFloat(valor);
            vetor1[i] = val;
        }

        JOptionPane.showMessageDialog(null, "Digite os elementos do segundo vetor");

        for (int i = 0; i < tam; i++) {
            valor = JOptionPane.showInputDialog("Elemento " + (i + 1));
            val = Float.parseFloat(valor);
            vetor2[i] = val;
        }

        for (int i = 0; i < tam; i++) {
            prod_escalar += vetor1[i] * vetor2[i];
        }

        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + prod_escalar);
    }
}
