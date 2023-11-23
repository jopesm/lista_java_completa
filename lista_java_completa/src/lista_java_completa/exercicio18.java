package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio18 {

    public static void main(String[] args) {

        String numero_linhas, numero_colunas;
        int nro_l, nro_c;

        numero_linhas = JOptionPane.showInputDialog("Digite o numero de linhas:");
        nro_l = Integer.parseInt(numero_linhas);

        numero_colunas = JOptionPane.showInputDialog("Digite o numero de colunas:");
        nro_c = Integer.parseInt(numero_colunas);

        int[][] matriz = new int[nro_l][nro_c];
        int[][] matriz_transposta = new int[nro_c][nro_l]; 

        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz: ");

        for (int i = 0; i < nro_l; i++) {
            for (int j = 0; j < nro_c; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento: "));
            }
        }

        for (int i = 0; i < nro_l; i++) {
            for (int j = 0; j < nro_c; j++) {
                matriz_transposta[j][i] = matriz[i][j]; 
            }
        }

        StringBuilder mensagem = new StringBuilder("A transposta da matriz é:\n");
        for (int i = 0; i < nro_c; i++) { 
            for (int j = 0; j < nro_l; j++) { 
                mensagem.append(matriz_transposta[i][j]).append(" ");
            }
            mensagem.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}

