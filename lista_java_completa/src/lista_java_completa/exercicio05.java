package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio05 {

    public static void main(String[] args) {

        String idade_anos;
        int i1, meses, dias, horas, minutos;

        idade_anos = JOptionPane.showInputDialog("Digite sua idade em anos");
        i1 = Integer.parseInt(idade_anos);

        meses = i1 * 12;
        dias = i1 * 365;
        horas = dias * 24;
        minutos = horas * 60;

        JOptionPane.showMessageDialog(null, "Idade em meses = " + meses);
        JOptionPane.showMessageDialog(null, "Idade em dias = " + dias);
        JOptionPane.showMessageDialog(null, "Idade em horas = " + horas);
        JOptionPane.showMessageDialog(null, "Idade em minutos = " + minutos);

    }
}
