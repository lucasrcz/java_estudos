package poo_exercicios;

import classes.Warehouse;

public class armazens {
    public static void main(String[] args) {
        Warehouse armazem = new Warehouse(100);
        System.out.println(armazem);
        armazem.addToWhareHouse(10);
        System.out.println(armazem);
    }
}
