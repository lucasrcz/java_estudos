package classes;

public class ProductB {
    private String  nome;
    private String local;
    private int peso;

    public ProductB(String nome){
        this.nome = nome;
        this.local = "Prateleira";
        this.peso = 1 ;
    }

    public ProductB(String nome , String local){
        this.nome = nome;
        this.local = local;
        this.peso = 1;
    }

    public ProductB(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
        this.local = "Prateleira";
    }

    @Override
    public String toString(){
        return "Nome:" + this.nome + ", peso: " + this.peso + ", local: " + this.local ;
    }
}