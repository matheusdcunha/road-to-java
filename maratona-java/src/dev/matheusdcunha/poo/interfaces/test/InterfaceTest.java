package dev.matheusdcunha.poo.interfaces.test;

import dev.matheusdcunha.poo.interfaces.dominio.DatabaseLoader;

public class InterfaceTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();

        databaseLoader.load();
        databaseLoader.notificarSucesso();
    }
}
