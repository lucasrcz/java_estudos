package classes;

public class Book implements Empacotavel {
    private String autor;
    private String titulo;
    private double peso;

    public Book(String autor , String titulo, double peso){
        this.autor = autor;
        this.titulo = titulo;
        this.peso = peso ;
    }

    public double pesar(){
        return this.peso;
    }

    @Override
    public String toString(){
        return this.autor + ": " + this.titulo;
    }


}
