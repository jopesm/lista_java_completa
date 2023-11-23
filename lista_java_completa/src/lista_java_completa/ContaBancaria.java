package lista_java_completa;

import javax.swing.JOptionPane;

class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser maior que zero.");
        }
    }
}