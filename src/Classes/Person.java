package Classes;

public class Person {
    private String name;
    private int age;
    //Constructor
    public Person(String initialName, int idade) {
        this.age = idade;
        this.name = initialName;
    }
    //Printa informações
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    //Adiciona + 1 na this.age se a pessoa for menor que 30 anos
    public void growOlder(){
        if(this.age < 30){
            this.age = this.age + 1;
        }
    }
    //Checa se a pessoa é menor de idade
    public boolean checkAge(){
        if(this.age<18){
            return true;
        }else{
            return false;
        }
    }
}