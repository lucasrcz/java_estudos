package classes;

public class Person {
    private String name;
    private int age;
    private double peso;
    private double altura;
    private simpleDate birthday;
    //Constructor
    public Person(String initialName, int idade, double altura,double peso) {
        this.age = idade;
        this.name = initialName;
        this.altura = altura ;
        this.peso = peso ;
    }
    public Person(String initialName, int idade) {
        this.age = idade;
        this.name = initialName;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new simpleDate(day, month, year);
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
    //Adiciona + 1 na this.age se não houver parâmetros ou se houver adiciona o ano .
    public void growOlder() {
        this.age = this.age + 1;
    }
    
    public void growOlder(int years) {
        this.age = this.age + years;
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

    public double getAltura() {
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void addPeso(double adicional){
        this.peso += adicional ;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}