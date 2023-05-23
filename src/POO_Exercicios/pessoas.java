package POO_Exercicios;
import Classes.Person;

public class pessoas {
    public static void main(String[] args) {
        Person lucas = new Person("Lucas", 27);
        lucas.printPerson();
        System.out.println("Lucas é menor de idade? " + lucas.checkAge());
    }
}
