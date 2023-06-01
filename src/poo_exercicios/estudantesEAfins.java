package poo_exercicios;

import javax.sound.sampled.SourceDataLine;

import classes.Student;

public class estudantesEAfins {
    public static void main(String[] args) {
        Student lucas = new Student("Lucas", "Rua Dos Mundurucs 984 Apto 22");
        System.out.println(lucas);
        System.out.println(lucas.getCredito());
        lucas.estudar();
        System.out.println(lucas.getCredito());
    }
}
