package dev.matheusdcunha.poo.polimorfismo.dominios;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.05;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
