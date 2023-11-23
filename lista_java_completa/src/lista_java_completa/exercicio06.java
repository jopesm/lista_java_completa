package lista_java_completa;

import javax.swing.JOptionPane;

public class exercicio06 {

    public static void main(String[] args) {
        String peso_kg, alt_m;
        float peso, altura, imc;

        peso_kg = JOptionPane.showInputDialog("Digite seu peso em kg");
        peso = Float.parseFloat(peso_kg);

        alt_m = JOptionPane.showInputDialog("Digite sua altura em m");
        altura = Float.parseFloat(alt_m);

        imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: abaixo do peso ");
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: peso normal ");
        } else if (imc >= 25.0 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: levemente acima do peso ");
        } else if (imc >= 30.0 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: obesidade ");
        } else if (imc >= 35.0 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: obesidade severa ");
        } else if (imc > 40) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: obesidade mórbida");
        }
    }
}