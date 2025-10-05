package dev.matheusdcunha.poo.abstracts.dominio;

public class Desenvolvedor extends Funcionario{

    Gerente lider;

    public Desenvolvedor(String nome, double salario, Gerente lider) {
        super(nome, salario);
        this.lider = lider;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
//                "lider=" + lider +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
