package classes;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String endereco;

    Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", endereço=" + endereco + "]";
    }

    
}
