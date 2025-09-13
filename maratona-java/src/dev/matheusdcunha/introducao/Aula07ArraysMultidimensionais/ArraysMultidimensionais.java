package dev.matheusdcunha.introducao.Aula07ArraysMultidimensionais;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];

        matriz[0][0] = 10;
        matriz[1][2] = 25;

        String[][] tabuleiro = {
                {"R", "N", "B"},
                {"P", "P", "P"},
                {" ", "K", " "}
        };

        int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] linhas : numeros){
            for(int coluna : linhas){
                System.out.println(coluna);
            }
        }

        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[i].length; j++){
                System.out.println(tabuleiro[i][j]);
            }
        }

    }
}
