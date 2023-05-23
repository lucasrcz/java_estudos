package POO_Exercicios;
import Classes.Product;

public class produtos {
    public static void main(String[] args) {
        Product produtoA = new Product( "Escova", 4.75, 20);
        Product produtoB = new Product("Carne Bovina", 30.75, 100);
        Product produtoC = new Product("Desodorante Rexona", 18.50, 200);
        produtoA.printProductVariable();
        produtoB.printProductVariable();
        produtoC.printProductVariable();

    }
}
