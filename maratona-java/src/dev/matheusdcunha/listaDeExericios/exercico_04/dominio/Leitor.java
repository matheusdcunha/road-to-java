package dev.matheusdcunha.listaDeExericios.exercico_04.dominio;

public class Leitor {
    int numero;

    public Leitor(int numero) {
        this.numero = numero;
    }

    public void imprimirNumeros(){

        int antecessor = this.numero - 1;
        int sucessor = this.numero + 1;

        System.out.println("Numero do leitor: " + this.numero);
        System.out.println("Numero antecessor: " + antecessor);
        System.out.println("Numero sucessor: " + sucessor);
    }

}
