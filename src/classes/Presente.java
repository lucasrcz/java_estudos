package classes;

public class Presente {
    private double peso;
    private String nome;

    public Presente(double peso , String nome){
    
    this.peso = peso ;
    this.nome = nome;
    }

    public double getPeso(){
        return this.peso;
    }
    public String getNome(){
        return this.nome;
    }

    @Override

    public String toString(){
        return this.nome + "(" + this.peso + " kg)";
    }
}
