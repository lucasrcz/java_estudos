package poo_exercicios;

import classes.CustomTaco;
import classes.TripleTacoBox;

public class tacos {
    public static void main(String[] args) {
        CustomTaco tacos = new CustomTaco(10);
        System.out.println(tacos.tacosRemaining());
        tacos.eat();
        System.out.println(tacos.tacosRemaining());
    
        TripleTacoBox tacosTriple = new TripleTacoBox();
        System.out.println(tacosTriple.tacosRemaining());
        tacosTriple.eat();
        System.out.println(tacosTriple.tacosRemaining());

    }
}
