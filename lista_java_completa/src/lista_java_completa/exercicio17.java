package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio17 {

    public static void main(String[] args) {

        String numero_linhas_matriz1, numero_colunas_matriz1, numero_linhas_matriz2, numero_colunas_matriz2;
        int nro_linhas_matriz1, nro_colunas_matriz1, nro_linhas_matriz2, nro_colunas_matriz2;

        numero_linhas_matriz1 = JOptionPane.showInputDialog("Digite o número de linhas da matriz 1:");
        nro_linhas_matriz1 = Integer.parseInt(numero_linhas_matriz1);

        numero_colunas_matriz1 = JOptionPane.showInputDialog("Digite o número de colunas da matriz 1:");
        nro_colunas_matriz1 = Integer.parseInt(numero_colunas_matriz1);

        int[][] matriz1 = new int[nro_linhas_matriz1][nro_colunas_matriz1];

        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz 1: ");

        for (int i = 0; i < nro_linhas_matriz1; i++) {
            for (int j = 0; j < nro_colunas_matriz1; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
            }
        }

        numero_linhas_matriz2 = JOptionPane.showInputDialog("Digite o número de linhas da matriz 2:");
        nro_linhas_matriz2 = Integer.parseInt(numero_linhas_matriz2);

        numero_colunas_matriz2 = JOptionPane.showInputDialog("Digite o número de colunas da matriz 2:");
        nro_colunas_matriz2 = Integer.parseInt(numero_colunas_matriz2);

        int[][] matriz2 = new int[nro_linhas_matriz2][nro_colunas_matriz2];

        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz 2: ");

        for (int i = 0; i < nro_linhas_matriz2; i++) {
            for (int j = 0; j < nro_colunas_matriz2; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
            }
        }

        if (nro_colunas_matriz1 != nro_linhas_matriz2) {
            JOptionPane.showMessageDialog(null, "As matrizes não podem ser multiplicadas. O número de colunas da matriz 1 deve ser igual ao número de linhas da matriz 2.");
            return;
        }

        int[][] matriz_produto = new int[nro_linhas_matriz1][nro_colunas_matriz2];

        for (int i = 0; i < nro_linhas_matriz1; i++) {
            for (int j = 0; j < nro_colunas_matriz2; j++) {
                for (int k = 0; k < nro_colunas_matriz1; k++) {
                    matriz_produto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        StringBuilder mensagem = new StringBuilder("O produto das matrizes é:\n");
        for (int i = 0; i < nro_linhas_matriz1; i++) {
            for (int j = 0; j < nro_colunas_matriz2; j++) {
                mensagem.append(matriz_produto[i][j]).append(" ");
            }
            mensagem.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
