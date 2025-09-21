package dev.matheusdcunha.javacore.polimorfismo.service;

import dev.matheusdcunha.javacore.polimorfismo.dominios.Computador;
import dev.matheusdcunha.javacore.polimorfismo.dominios.Tomate;

public class CalculadorImposto {
    public void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");

        double valor = computador.calcularImposto();

        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor do imposto: " + valor);
    }

    public void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate");

        double valor = tomate.calcularImposto();

        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor do imposto: " + valor);
    }
}
