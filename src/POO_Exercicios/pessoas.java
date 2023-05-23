package POO_Exercicios;
import Classes.Person;

public class pessoas {
    public static void main(String[] args) {
        Person lucas = new Person("Lucas", 27);
        System.out.println("Lucas é menor de idade? " + lucas.checkAge());
        System.out.println(lucas);
        lucas.setAltura(1.70);
        lucas.setPeso(85);
        System.out.println(String.format("%.2f",lucas.showImc()));
    }
}
