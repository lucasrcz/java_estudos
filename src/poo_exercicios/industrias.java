package poo_exercicios;

import classes.Industria;

public class industrias {
    public static void main(String[] args) {
        Industria industria = new Industria();
        industria.add("a12","Patins");
        industria.add("a12","Iphone");
        System.out.println(industria.printaLista("a12"));
        System.out.println(industria.printaLista("a15"));
    }
}
