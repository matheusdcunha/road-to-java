package dev.matheusdcunha.poo.introducaoClasses.test;

import dev.matheusdcunha.poo.introducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(300);

        System.out.println(Carro.numeroInstancias);
    }
}
