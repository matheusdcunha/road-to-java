package dev.matheusdcunha.introducao.Aula06Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3};
        String [] nomes = { "Maria", "Juan", "Pedro" };

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        for(String i:nomes){
            System.out.println(i);
        }
        for(int numero:numeros2){
            System.out.println(numero);
        }

    }
}
