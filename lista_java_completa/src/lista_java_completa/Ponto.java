package lista_java_completa;

import javax.swing.JOptionPane;

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void trocarCoordenadas() {
        double temp = x;
        x = y;
        y = temp;
    }
}

