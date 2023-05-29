package classes;

public class Apartamento {
    private double preco;
    private int quartos;
    private int metroQuadrado;

    public Apartamento(double preco , int quartos , int metroQuadrado ){
        this.preco = preco;
        this.quartos = quartos;
        this.metroQuadrado = metroQuadrado;
    }


    public boolean maiorQue(Apartamento apto){ //Verifica se o apartamento do método é maior que o apartamento do parâmetro
         if(this.metroQuadrado > apto.metroQuadrado){
            return true;
         }else{
            return false;
         }
    }

    public double  diferencaDePreco(Apartamento apto){
        if(this.preco< apto.preco){
            return apto.preco - this.preco ; 
        }else{
            return this.preco - apto.preco ;
        }
    }


    public boolean maisCaroQue(Apartamento apto){
      if(this.preco > apto.preco){
        return true;
      }else{
        return false;
      }
    }
      
}
