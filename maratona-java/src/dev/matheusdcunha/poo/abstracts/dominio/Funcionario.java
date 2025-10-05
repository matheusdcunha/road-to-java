package dev.matheusdcunha.poo.abstracts.dominio;

public abstract class Funcionario{
    protected String nome;
    protected double salario;

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double getSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
