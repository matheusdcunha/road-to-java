package dev.matheusdcunha.listaDeExericios.exercico_05.dominio;

public class CalculadoraSalario {
    private final double salarioMinimo = 1293.20;
    private double salario;

    public CalculadoraSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        return this.salario / this.salarioMinimo;
    }

 }
