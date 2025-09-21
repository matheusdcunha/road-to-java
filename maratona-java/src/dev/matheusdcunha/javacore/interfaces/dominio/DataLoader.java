package dev.matheusdcunha.javacore.interfaces.dominio;

public interface DataLoader {
    void load();
    default void notificarSucesso(){
        System.out.println("Sucesso!");
    }
}
