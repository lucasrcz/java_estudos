package POO_Exercicios;
import Classes.Assovio;

public class assovios {
    public static void main(String[] args) {
        Assovio assovioPato = new Assovio("Quack");
        Assovio assovioGato = new Assovio("Miau");
        Assovio assovioCachorro = new Assovio("Auau");
    
        assovioCachorro.ouvir();
        assovioPato.ouvir();
        assovioGato.ouvir();

    }    
}
