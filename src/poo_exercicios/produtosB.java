package poo_exercicios;

import classes.ProductB;

public class produtosB {
    public static void main(String[] args) {
    ProductB tapeMeasure = new ProductB("Tape measure");
    ProductB plaster = new ProductB("Plaster", "home improvement section");
    ProductB tyre = new ProductB("Tyre", 5);

    System.out.println(tapeMeasure);
    System.out.println(plaster);
    System.out.println(tyre);
    }
}
