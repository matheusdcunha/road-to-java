package dev.matheusdcunha.poo.polimorfismo.dominios;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        return this.valor * Computador.IMPOSTO_POR_CENTO;
    }
}

