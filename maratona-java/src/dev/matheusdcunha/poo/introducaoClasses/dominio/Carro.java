package dev.matheusdcunha.poo.introducaoClasses.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    public static int numeroInstancias;

    public  Carro(){
        this.nome = "--";
        this.velocidadeMaxima = 0;
        Carro.numeroInstancias++;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        Carro.numeroInstancias++;
    }

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite) {
        this(nome, velocidadeMaxima);
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + this.velocidadeLimite);
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
