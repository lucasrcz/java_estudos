package classes;


public class Pessoa {
    private String nome;
    private String endereco;

    Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String  getNome(){
        return this.nome;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", endereço=" + endereco + "]";
    }

    
}
