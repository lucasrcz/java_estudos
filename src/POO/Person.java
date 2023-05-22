package POO;

public class Person {
    private String name;
    private int age;

    public Person(String initialName, int idade) {
        this.age = idade;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder(){
        if(this.age < 30){
            this.age = this.age + 1;
        }
    }
}