package POO_Exercicios;
import java.util.List;

import Classes.Film;

import java.util.Arrays;
public class filmes {
    public static void main(String[] args) {
        Film filmeA = new Film(18, "Todo mundo em pânico");
        Film filmeB = new Film(0, "Alvin e os esquilos");
        Film filmeC = new Film(18, "Oldboy");
        Film filmeD = new Film(0,"Xuxa só para baixinhos");
        System.out.println("Nome do filme:" + filmeA.retornaTitulo());
        System.out.println("Indicação etária de:" + filmeA.retornaIndicacao());
        System.out.println("Nome do filme:" + filmeB.retornaTitulo());
        System.out.println("Indicação etária de:" + filmeB.retornaIndicacao());
        System.out.println("Nome do filme:" + filmeC.retornaTitulo());
        System.out.println("Indicação etária de:" + filmeC.retornaIndicacao());
        System.out.println("Nome do filme:" + filmeD.retornaTitulo());
        System.out.println("Indicação etária de:" + filmeD.retornaIndicacao());
    }
}
