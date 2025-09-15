package dev.matheusdcunha.javacore.introducaoclasses.test;

import dev.matheusdcunha.javacore.introducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Matheus", 26, 'M', 30);
        Pessoa p2 = new Pessoa();
        p1.exibirDescricao();
        p1.exibirInformacoes();
        p2.exibirDescricao();
        p2.exibirInformacoes();
    }
}
