package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio04 {

    public static void main(String[] args) {
        String nota1, nota2, nota3, peso1, peso2, peso3;
        float n1, n2, n3, p1, p2, p3, media_pond;

        nota1 = JOptionPane.showInputDialog("Digite a 1 nota");
        n1 = Float.parseFloat(nota1);

        peso1 = JOptionPane.showInputDialog("Digite o peso da 1 nota");
        p1 = Float.parseFloat(peso1);

        nota2 = JOptionPane.showInputDialog("Digite a 2 nota");
        n2 = Float.parseFloat(nota2);

        peso2 = JOptionPane.showInputDialog("Digite o peso da 2 nota");
        p2 = Float.parseFloat(peso2);

        nota3 = JOptionPane.showInputDialog("Digite a 3 nota");
        n3 = Float.parseFloat(nota3);

        peso3 = JOptionPane.showInputDialog("Digite o peso da 3 nota");
        p3 = Float.parseFloat(peso3);

        
        media_pond = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);

        JOptionPane.showMessageDialog(null, "Media ponderada = " + media_pond);

    }
}