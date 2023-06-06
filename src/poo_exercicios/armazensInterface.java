package poo_exercicios;

import classes.Armazem;

public class armazensInterface {
    public static void main(String[] args) {
    Armazem warehouse = new Armazem();
    warehouse.addProduct("milk", 3, 10);
    warehouse.addProduct("coffee", 5, 6);
    warehouse.addProduct("buttermilk", 2, 20);
    warehouse.addProduct("yogurt", 2, 20);


    System.out.println("estoque:");
    System.out.println("coffee:  " + warehouse.estoque("coffee"));
    System.out.println("sugar: " + warehouse.estoque("sugar"));

    System.out.println("taking coffee " + warehouse.tirar("coffee"));
    System.out.println("taking coffee " + warehouse.tirar("coffee"));
    System.out.println("taking sugar " + warehouse.tirar("sugar"));

    System.out.println("estoque:");
    System.out.println("coffee:  " + warehouse.estoque("coffee"));
    System.out.println("sugar: " + warehouse.estoque("sugar"));
    
    System.out.println("Produtos:");
        for(String product : warehouse.products()){
            System.out.println(product);
        }
}


}
