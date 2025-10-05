package dev.matheusdcunha.listaDeExericios.exercico_03.dominio;

public class Leitor {
    int a;
    int b;
    int c;

    public Leitor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int calcularValores(){
        if(this.a == this.b){
            this.c = this.a + this.b;

            return this.c;
        }

        this.c = this.a * this.b;

        return this.c;
    }

    public void imprimirInfo(){
        this.calcularValores();
        System.out.println(this.c);
    }

}
