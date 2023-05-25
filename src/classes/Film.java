package classes;

public class Film {
    private int restricaoIdade ;
    private String nome ;
    public Film(int idade, String nome){
        this.restricaoIdade = idade;
        this.nome = nome;
    }
    public int retornaIndicacao(){
        return this.restricaoIdade;
    }
    public String retornaTitulo(){
        return this.nome;
    }
}
