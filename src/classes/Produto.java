package classes;

public class Produto {
    private String produto;
    private int quantidade;
    private int unidadePreco;
   
    public Produto(String produto, int quantidade, int unidadePreco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.unidadePreco = unidadePreco;
    }

    public int preco(){
        return this.unidadePreco * this.quantidade;
    }

    public void acrescentar(){
        this.quantidade += 1;
    }

    @Override
    public String toString() {
        return produto + ":" + quantidade;
    }

    
    
}
