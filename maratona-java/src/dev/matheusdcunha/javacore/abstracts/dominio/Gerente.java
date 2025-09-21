package dev.matheusdcunha.javacore.abstracts.dominio;

import java.util.Arrays;

public class Gerente extends Funcionario{
    protected Funcionario[] liderados;

    public Gerente(String nome, double salario, Funcionario[] liderados) {
        super(nome, salario);
        this.liderados = liderados;
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void setLiderados(Funcionario[] liderados) {
        this.liderados = liderados;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "liderados=" + Arrays.toString(liderados) +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
