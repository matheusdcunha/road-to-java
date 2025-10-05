package dev.matheusdcunha.listaDeExericios.exercico_01.dominio;

public class Soma {
    int a, b, c;

    public Soma(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getSoma(){

        int calculo = this.a + this.b;

        if(calculo < this.c){
            System.out.println("O número " + this.c + " é maior que  a soma de " + this.a + " + " + this.b);
            System.out.println("----------------------------");
        }

        System.out.println("Soma final: " + calculo);

    }

}
