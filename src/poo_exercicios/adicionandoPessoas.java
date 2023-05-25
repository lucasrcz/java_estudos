package poo_exercicios;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Person;

public class adicionandoPessoas {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Cria um arrray do tipo de objeto Person
    ArrayList<Person> persons = new ArrayList<>();
    while(true){
        System.out.println("Digite o nome de uma Pessoa:");
        String name = sc.nextLine();
        if(name.isEmpty()){
            break;
        }
        System.out.println("Digite a idade da pessoa:");
        int idade = Integer.valueOf(sc.nextLine());
        //Adiciona através do Construtor nome e idade , nesse caso idade está setado padrão 0
        persons.add(new Person(name,idade));
    }
    for(Person person : persons){
        //Dentro do loop for podemos utilizar os métodos de 
        System.out.println(person.toString());
    }
    sc.close();
}


}
