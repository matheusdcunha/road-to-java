package dev.matheusdcunha.javacore.classesUtilitarias.io;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String pathName = "." + File.separator + "das" + File.separator + "arquivos.txt";
        File arquivo = new File(pathName);

        try{
            arquivo.createNewFile();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        try(
                FileWriter fw = new FileWriter(arquivo);
                BufferedWriter bw = new BufferedWriter(fw);
        ){
            bw.write("Matheus da Cunha");
            bw.newLine();
            bw.write("Arquivos da Cunha");
            bw.newLine();
            bw.write("Arquivos da Cunha");
            bw.newLine();
            bw.write("Arquivos da Cunha");
            bw.newLine();
            bw.write("Arquivos da Cunha");
            bw.newLine();
            bw.write("Arquivos da Cunha");
            bw.newLine();
            bw.write("Arquivos da Cunha");
            System.out.println("Arquivo gravado com sucesso!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("--------");

        try(
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
        ){
            String linha;

            while((linha = br.readLine()) != null){
                System.out.print(linha +  "\n");
            }

            System.out.println();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("--------");


    }
}
