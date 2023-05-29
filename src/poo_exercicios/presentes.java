package poo_exercicios;

import classes.PacotesPresentes;
import classes.Presente;

public class presentes {
    public static void main(String[] args) {
        PacotesPresentes pacotes = new PacotesPresentes();
        Presente presenteA = new Presente(3.9, "PS5");
        Presente preseteB = new Presente(2, "Senhor dos aneis:As duas torres");
        System.out.println(pacotes.pesoTotal());
        pacotes.printaLista();
        pacotes.adicionaPresentes(presenteA);
        pacotes.adicionaPresentes(preseteB);
        System.out.println(pacotes.pesoTotal());
        pacotes.printaLista();
    }
}
