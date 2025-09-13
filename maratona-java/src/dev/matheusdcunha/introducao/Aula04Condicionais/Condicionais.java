package dev.matheusdcunha.introducao.Aula04Condicionais;

public class Condicionais {
    public static void main(String[] args) {
            int idade = 20;
            String nome = "Matheus";
            String fase = idade > 18 ? "Adulto" : "Jovem";

            if(nome == "Matheus"){
                System.out.println("Oi");
            }
            else{
                System.out.println("Tchau");
            }

        System.out.println(fase);

        byte dia = 1;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }



    }
}

