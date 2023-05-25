package poo_exercicios;

import classes.ParqueDeDiversao;
import classes.Person;

public class parquePessoas {
    public static void main(String[] args) {
        Person lucas = new Person("Lucas", 18);
        lucas.setPeso(85);
        lucas.setAltura(1.40);
        ParqueDeDiversao brinquedoA = new ParqueDeDiversao("Folia", 1.50);
        System.out.println(brinquedoA.permitidoEntrada(lucas));;
    }
}
