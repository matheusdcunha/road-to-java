package dev.matheusdcunha.poo.polimorfismo.test;

import dev.matheusdcunha.poo.polimorfismo.dominios.Computador;
import dev.matheusdcunha.poo.polimorfismo.dominios.Tomate;
import dev.matheusdcunha.poo.polimorfismo.service.CalculadorImposto;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD", 1200);
        Tomate tomate = new Tomate("Cereja", 0.50);

        CalculadorImposto calculadorImposto = new CalculadorImposto();

        calculadorImposto.calcularImpostoComputador(computador);
        calculadorImposto.calcularImpostoTomate(tomate);
    }
}
