package classes;

public class Livro{
    private String nome;
    private int paginas;


    public Livro(String nome , int paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object comparado){
        if(this == comparado){
            return true;
        }

        if(!(comparado instanceof Livro)){
            return false;
        }

        Livro livroComparado = (Livro) comparado;
        
        if(this.nome.toLowerCase().equals(livroComparado.nome) &&
           this.paginas == livroComparado.paginas){
            return true;
           }


        return false;
    }
}
