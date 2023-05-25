package classes;

public class Estatistica {
    private int soma ;
    private int contagem;
    //Construtor
    public Estatistica(){
        this.soma = 0;
        this.contagem = 0;
    }
    //Adiciona Número
    public void adicionaNumero(int numero){
        this.soma += numero ;
        this.contagem ++;
    }

    public int getContagem(){
        return this.contagem;
    }

    public int getSoma(){
        return this.soma;
    }

    public double media(){
        return  Double.valueOf(this.soma)/this.contagem;
    }

}
