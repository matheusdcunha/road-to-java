package dev.matheusdcunha.listaDeExericios.exercico_02.dominio;

public class AlgoritmoNumero {
    int numero;

    public AlgoritmoNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirInfo(){
        String informacoes = "";
        informacoes += "O numero " + this.numero + " ";

        if(numero % 2 == 0){
            informacoes += "é par ";
        }else{
            informacoes += "é impar ";
        }

        if(numero >= 0){
            informacoes += "e positivo ";
        }else{
            informacoes += "e negativo ";
        }

        System.out.println(informacoes);
    }


}
