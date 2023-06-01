package poo_exercicios;


import java.util.ArrayList;

import classes.Pessoa;
import classes.Professor;
import classes.Student;

public class estudantesEAfins {
    public static void main(String[] args) {
        Student lucas = new Student("Lucas", "Rua Dos Mundurucs 984 Apto 22");
        System.out.println(lucas);
        System.out.println(lucas.getCredito());
        lucas.estudar();
        System.out.println(lucas.getCredito());

        Professor daniel = new Professor("Daniel", "Vila Firenze", 30000);

        ArrayList<Pessoa> pessoas= new ArrayList<Pessoa>();
        pessoas.add(lucas);
        pessoas.add(daniel); 

        System.out.println("Lista de pessoas:");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }

        Pessoa olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
    }
}
