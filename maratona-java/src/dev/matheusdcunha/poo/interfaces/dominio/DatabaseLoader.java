package dev.matheusdcunha.poo.interfaces.dominio;


public class DatabaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

}
