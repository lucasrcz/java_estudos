package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Armazem {
    private Map<String, Integer> preco;
    private Map<String, Integer> estoque;

    
    public Armazem() {
        this.preco = new HashMap<>();
        this.estoque = new HashMap<>();
    }

    public void addProduct(String produto, int preco, int estoque){
        this.estoque.put(produto, estoque);
        this.preco.put(produto, preco);
    }

    public int price(String product){
        if(this.preco.get(product)==null){
            return -99;
        }else{
            return this.preco.get(product);
        }
    }

    public int estoque(String product){
        if(this.estoque.get(product)==null){
            return 0;
        }else{
            return this.estoque.get(product);
        }
    }
    
    public boolean tirar(String product){
        if(this.estoque.get(product) == null || this.estoque.get(product) == 0){
            return false;
        }else{
            this.estoque.put(product, this.estoque(product) - 1);
            return true;
        }
    }

    public Set<String> products(){
        return this.preco.keySet();
    }
}
