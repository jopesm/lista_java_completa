package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio02 {

    public static void main(String[] args) {
        String temp_cel;
        String temp_far;
        String opcao;
        float t1, t2, cel_to_far, far_to_cel;

        opcao = JOptionPane.showInputDialog("Escolha o tipo de conversão:\r\n" + "1. Celsius para Fahrenheit\r\n" + "2. Fahrenheit para Celsius");

        // Convertendo a String para int
        int escolha = Integer.parseInt(opcao);

        if (escolha == 1) {
            temp_cel = JOptionPane.showInputDialog("Digite a temperatura em C");
            t1 = Float.parseFloat(temp_cel);
            cel_to_far = ((t1 * 9 / 5) + 32);
            JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit = " + cel_to_far);

        } else if (escolha == 2) {
            temp_far = JOptionPane.showInputDialog("Digite a temperatura em F");
            t2 = Float.parseFloat(temp_far);
            far_to_cel = ((t2 - 32) * 5 / 9);
            JOptionPane.showMessageDialog(null, "Temperatura em Celsius = " + far_to_cel);

        } else {
            JOptionPane.showMessageDialog(null, "Escolha inválida");
        }
    }
}