package dev.matheusdcunha.poo.heranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }
}
