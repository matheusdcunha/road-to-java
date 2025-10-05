package dev.matheusdcunha.poo.abstracts.test;

import dev.matheusdcunha.poo.abstracts.dominio.Desenvolvedor;
import dev.matheusdcunha.poo.abstracts.dominio.Funcionario;
import dev.matheusdcunha.poo.abstracts.dominio.Gerente;

public class AbstractsTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 12000);

        Desenvolvedor dev = new Desenvolvedor("Zoro", 4000, gerente);
        Desenvolvedor dev2 = new Desenvolvedor("Nami", 7000, gerente);
        Desenvolvedor dev3 = new Desenvolvedor("Sanji", 3000, gerente);

        Funcionario[] funcionarios = {dev, dev2, dev3};

        gerente.setLiderados(funcionarios);



        System.out.println(gerente);
//        System.out.println(dev);
    }
}
