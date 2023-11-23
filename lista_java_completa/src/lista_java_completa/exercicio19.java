package lista_java_completa;

import javax.swing.JOptionPane;

import lista_java_completa.Ponto;

public class exercicio19 {
    public static void main(String[] args) {
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do ponto:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do ponto:"));

        
        Ponto ponto = new Ponto(x, y);

        
        ponto.trocarCoordenadas();

        
        exibirPonto("Coordenadas trocadas:", ponto);
    }

    public static void exibirPonto(String mensagem, Ponto ponto) {
        JOptionPane.showMessageDialog(null, mensagem +
                "\nCoordenadas: (" + ponto.getX() + ", " + ponto.getY() + ")");
    }
}