package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio16 {

    public static void main(String[] args) {

        String numero_linhas, numero_colunas;
        int nro_l, nro_c;

        numero_linhas = JOptionPane.showInputDialog("Digite o numero de linhas:");
        nro_l = Integer.parseInt(numero_linhas);

        numero_colunas = JOptionPane.showInputDialog("Digite o numero de colunas:");
        nro_c = Integer.parseInt(numero_colunas);

        int[][] matriz1 = new int[nro_l][nro_c];
        int[][] matriz2 = new int[nro_l][nro_c];
        int[][] matriz_soma = new int[nro_l][nro_c];

        
        JOptionPane.showMessageDialog(null, "Digite os elementos da primeira matriz: ");

        for (int i = 0; i < nro_l; i++) {
            for (int j = 0; j < nro_c; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
            }
        }

        
        JOptionPane.showMessageDialog(null, "Digite os elementos da segunda matriz: ");

        for (int i = 0; i < nro_l; i++) {
            for (int j = 0; j < nro_c; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
            }
        }

        
        for (int i = 0; i < nro_l; i++) {
            for (int j = 0; j < nro_c; j++) {
                matriz_soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        
        StringBuilder mensagem = new StringBuilder("A soma das matrizes é:\n");
        for (int i = 0; i < nro_l; i++) {
            for (int j = 0; j < nro_c; j++) {
                mensagem.append(matriz_soma[i][j]).append(" ");
            }
            mensagem.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
