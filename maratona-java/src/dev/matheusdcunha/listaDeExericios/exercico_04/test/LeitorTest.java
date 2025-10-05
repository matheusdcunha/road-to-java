package dev.matheusdcunha.listaDeExericios.exercico_04.test;

import dev.matheusdcunha.listaDeExericios.exercico_04.dominio.Leitor;

public class LeitorTest {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(-25);

        leitor.imprimirNumeros();
    }
}
