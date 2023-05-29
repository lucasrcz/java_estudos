package classes;


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

    @Override
    public boolean equals(Object comparado){
        if(this == comparado){
            return true;
        }

        if(!(comparado instanceof Song)){
            return false;
        }

        Song musicaComparada = (Song) comparado;

        if(this.name.toLowerCase().equals(musicaComparada.name.toLowerCase()) &&
           this.duracao == musicaComparada.duracao){
            return true;
        }
        
        return false;
    }
}
