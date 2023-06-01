package classes;

public class ProductWharehouse extends Warehouse {
    
    private String nomeDoProducto;

    public ProductWharehouse(String nomeDoProducto , double capacidade){
        
        super(capacidade);

        this.nomeDoProducto = nomeDoProducto;
    }

    public String getName(){
        return this.nomeDoProducto;
    }
}
