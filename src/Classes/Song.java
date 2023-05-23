package Classes;

public class Song {
    private String name ;
    private int duracao ;
    
    public Song(String name, int duracao){
        this.name = name;
        this.duracao = duracao;
    }

    public String retornaNome(){
        return this.name;
    }
    public int retornaDuracao(){
        return this.duracao;
    }

}
