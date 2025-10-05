package dev.matheusdcunha.listaDeExericios.exercico_05.test;

import dev.matheusdcunha.listaDeExericios.exercico_05.dominio.CalculadoraSalario;

public class CalculadoraSalarioTest {


    public static void main(String[] args) {
        double salarioUsuario = 2612.92;
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario(salarioUsuario);

        System.out.println(calculadoraSalario.calcularSalario());



    }
}
