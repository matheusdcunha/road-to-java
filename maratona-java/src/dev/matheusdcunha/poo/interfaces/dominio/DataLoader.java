package dev.matheusdcunha.poo.interfaces.dominio;

public interface DataLoader {
    void load();
    default void notificarSucesso(){
        System.out.println("Sucesso!");
    }
}
