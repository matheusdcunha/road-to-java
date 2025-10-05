package dev.matheusdcunha.javacore.exceptions;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo/arquivo.txt");
        try{
            boolean isCriado  = file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro ao criar o arquivo!");
        }
    }


}
