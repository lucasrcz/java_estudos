package poo_exercicios;

import classes.ParqueDeDiversao;
import classes.Person;

public class parquePessoas {
    public static void main(String[] args) {
        Person lucas = new Person("Lucas", 18);
        Person daniel = new Person("Daniel", 23);
        daniel.addPeso(70);
        daniel.setAltura(1.80);
        lucas.setPeso(85);
        lucas.setAltura(1.70);
        ParqueDeDiversao brinquedoA = new ParqueDeDiversao("Folia", 1.50);
        System.out.println(brinquedoA.toString());
        System.out.println("Media altura:" + brinquedoA.calcularMediaAltura());
        brinquedoA.permitidoEntrada(lucas);
        brinquedoA.permitidoEntrada(daniel);
        System.out.println(brinquedoA.toString());
        System.out.println("Media altura:" + brinquedoA.calcularMediaAltura());

    }
}
