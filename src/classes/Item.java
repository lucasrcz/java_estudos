package classes;


public class Item {
    
    private String nome;
    private double peso;

    public Item(String nome , double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }

    @Override
    public String toString(){
        return this.getNome() + "(" + this.getPeso() + " KG)";
    }
}
