package lista_java_completa;

import javax.swing.JOptionPane;

import lista_java_completa.ContaBancaria;

public class exercicio21 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        String inputValorDeposito = JOptionPane.showInputDialog("Digite o valor do depósito:");
        double valorDeposito = Double.parseDouble(inputValorDeposito);

        realizarDeposito(conta, valorDeposito);

        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + conta.getSaldo());
    }

    public static void realizarDeposito(ContaBancaria conta, double valor) {
        conta.depositar(valor);
    }
}