package poo_exercicios;
import classes.Item;
import classes.Maleta;
public class itens {

    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 3.2);
        Item phone = new Item("Nokia 3210", 0.7);



        Maleta maleta = new Maleta(5.0);
        System.out.println( maleta.getMaiorPeso());
        maleta.printaItens();
        maleta.adicionarItem(book);
        maleta.printaItens();
        maleta.adicionarItem(phone);
        maleta.printaItens();
        System.out.println( maleta.getMaiorPeso());
    }
}
