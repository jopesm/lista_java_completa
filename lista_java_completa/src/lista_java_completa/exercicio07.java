package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio07 {

    public static void main(String[] args) {
        String numero;
        int nro; 

        numero = JOptionPane.showInputDialog("Digite um numero");
        
        
        nro = Integer.parseInt(numero);

        if (nro % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + nro + " é par");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + nro + " é ímpar");
        }
    }
}

