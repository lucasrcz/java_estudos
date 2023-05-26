package poo_exercicios;

import classes.Hospital;
import classes.Person;

public class hospitais {
    public static void main(String[] args) {
        Person lucas = new Person("Lucas", 27,1.70,85.4);
        Person joao = new Person("João",27,1.80,67.5);
        Hospital hospitalNeves = new Hospital();
        hospitalNeves.mostrarContagem();
        System.out.println(lucas.getName() + ":" +hospitalNeves.pesar(lucas)+ "KG");
        System.out.println(joao.getName() + ":" + hospitalNeves.pesar(joao) + "KG");
        hospitalNeves.mostrarContagem();
        hospitalNeves.alimentar(lucas);
        hospitalNeves.alimentar(lucas);
        System.out.println(lucas.getName() + ":" +hospitalNeves.pesar(lucas)+ "KG");
        System.out.println(joao.getName() + ":" + hospitalNeves.pesar(joao) + "KG");
        hospitalNeves.mostrarContagem();


    }   
}
