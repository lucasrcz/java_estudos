import java.util.List;
import java.util.Arrays;

import POO.Film;
public class filmes {
    public static void main(String[] args) {
        Film filmeA = new Film(18, "Todo mundo em pânico");
        Film filmeB = new Film(0, "Alvin e os esquilos");
        Film filmeC = new Film(18, "Oldboy");
        Film filmeD = new Film(0,"Xuxa só para baixinhos");
        System.out.println("Nome do filme:" + filmeA.retornaTitulo());
        System.out.println("Indicação etária de:" + filmeA.retornaIndicacao());
        List <Film> lista = Arrays.asList(filmeA,filmeB,filmeC);
        System.out.println(lista.get(0).nome);
    
    }
}
