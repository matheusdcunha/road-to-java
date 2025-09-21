package dev.matheusdcunha.javacore.interfaces.test;

import dev.matheusdcunha.javacore.interfaces.dominio.DatabaseLoader;

public class InterfaceTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();

        databaseLoader.load();
        databaseLoader.notificarSucesso();
    }
}
