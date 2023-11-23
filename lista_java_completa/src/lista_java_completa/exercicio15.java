package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio15 {

    public static void main(String[] args) {

        String palavra;
        boolean palindromo = true;

        palavra = JOptionPane.showInputDialog("Digite a palavra");

        String[] vetor_palavra = new String[palavra.length()];
        String[] palavra_invertida = new String[palavra.length()];

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavra_invertida[palavra.length() - 1 - i] = Character.toString(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            vetor_palavra[i] = Character.toString(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            if (!vetor_palavra[i].equals(palavra_invertida[i])) {
                JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" não é um palíndromo.");
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo.");
        }
    }
}
