package dev.matheusdcunha.introducao.Aula05Repeticao;

public class Repeticao {
    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;

        // for
        for(int i = 0; i <= 10; i++){
            if(contador % 2 != 0){
                System.out.println(contador);
            }
            contador++;
        }

        // while
        while (contador2 <= 10) {
            if (contador2 % 2 == 0) {
                System.out.println("Número par: " + contador2);
            }
            contador2++;
        }

        // do while
        do {

            System.out.println("Executado");

        } while (contador <= 5);

    }
}
