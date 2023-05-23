package Classes;

public class Product {
    private double price;
    private int quantity;
    private String name;
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProductVariable(){
        System.out.println("Preço:"+ this.price);
        System.out.println("Quantidade:" + this.quantity);
        System.out.println("Nome: " + this.name);
        System.out.println("");
    }
}
