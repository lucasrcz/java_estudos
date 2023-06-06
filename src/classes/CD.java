package classes;

public class CD implements Empacotavel {
    private String artista;
    private String album;
    private int ano;
    private double peso;
    
    
    public CD(String artista, String album, int ano) {
        this.artista = artista;
        this.album = album;
        this.ano = ano;
        this.peso = 0.1;
    }


    @Override
    public String toString() {
        return  this.artista + ":" + this.album + "()" + this.ano + ")";
    }

    public double pesar(){
        return this.peso;
    }
}
