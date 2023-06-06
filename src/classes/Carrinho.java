package classes;
import java.util.HashMap;
import java.util.Map;
public class Carrinho {

    private Map<String, Produto> carrinho;
    
    public Carrinho(){
        this.carrinho = new HashMap<>();
    }

    public void add(String product , int price){
        carrinho.put(product , new Produto(product, 1, price));
    }

    public int price(){
        int price = 0 ;
        for(Map.Entry<String , Produto> produto : carrinho.entrySet()){
           price += produto.getValue().preco();
        }

        return price;
    }
}
