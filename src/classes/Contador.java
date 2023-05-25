package classes;

public class Contador {
    private int valor;
    
    public Contador(int valorInicial){
        this.valor = valorInicial;
    }

    public Contador(){
        this.valor = 0;
    }

    public void aumentar(){
        this.valor ++;
    }

    public void diminuir(){
        this.valor --;
    }

    public void aumentar(int aumento){
        this.valor += aumento;
    }
    
    public void diminuir(int decremento){
        this.valor -= decremento ;
    }

    @Override
    public String toString(){
        return String.valueOf(this.valor);
    }

}
