package dev.matheusdcunha.javacore.heranca.test;

import dev.matheusdcunha.javacore.heranca.dominio.Endereco;
import dev.matheusdcunha.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("121321", "Rua do Fim");

        Pessoa pessoa = new Pessoa("Matheus", "1231", endereco);


        System.out.println(pessoa);

    }
}
