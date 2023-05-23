package Classes;

public class Person {
    private String name;
    private int age;
    private double peso;
    private double altura;
    //Constructor
    public Person(String initialName, int idade) {
        this.age = idade;
        this.name = initialName;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura ;
    }

    public double showImc(){
        return this.peso / Math.pow(this.altura,2);
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
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + ", tem " + this.age + " anos"; 
    }
}