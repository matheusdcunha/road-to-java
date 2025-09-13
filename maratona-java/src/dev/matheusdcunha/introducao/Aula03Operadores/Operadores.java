package dev.matheusdcunha.introducao.Aula03Operadores;

public class Operadores {

    public static void main(String[] args) {

        // Operadores Aritiméticos
        int numero1 = 10;
        int numero2 = 20;

        int adicao = numero1 + numero2; // 30
        int subtracao = numero2 - numero1; // 10
        int multiplicacao = numero1 * numero2; // 200
        int divisao = numero2 / numero1; // 2
        int modulo = numero2 & numero1; // 0

        // Operadores Relacionais
        boolean isMenor = 10 < 20  ; // true
        boolean isMaior = 20 > 10; //true
        boolean isMenorIgual = 20 <= 20; // true
        boolean isMaiorIgual = 10 >= 20;// false
        boolean isIgual = 10 == 5; // false
        boolean isDiferente = 10 != 20; // true

        // Operadores Lógicos
        boolean precisaPagarImposto = (5000 > 2000) && (10 == 10); // true
        boolean podeEntrarNaFesta = (18 >= 18) && (20 < 10); // false

        boolean temDesconto = (100 > 50) || (5 == 1); // true
        boolean diaDeDescanso = (1 == 2) || (10 > 100); // false

        boolean estaChovendo = true;
        boolean possoSairSemGuardaChuva = !estaChovendo; // false

        boolean tarefaConcluida = false;
        boolean precisaFazer = !tarefaConcluida; // true


    }

}
