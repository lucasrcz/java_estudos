package fundamentos;
import classes.DiminuirContador;

public class decreasingExercise{
    public static void main(String[] args) {
        DiminuirContador counter = new DiminuirContador(100);
        counter.mostraValor();
        counter.diminuir();
        counter.mostraValor();
        counter.resetar();
        counter.mostraValor();
    }
}