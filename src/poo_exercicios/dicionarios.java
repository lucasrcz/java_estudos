package poo_exercicios;

import classes.DicionarioLinguas;

public class dicionarios {
    public static void main(String[] args) {
        DicionarioLinguas dicionario = new DicionarioLinguas();

        dicionario.add("Olá", "Hello");
        dicionario.add("Olá", "Hola");
        System.out.println(dicionario.traduzir("Olá"));
    }
}
