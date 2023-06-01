package classes;

public class Warehouse {
    private double capacidade; //Capacidade total
    private double balance; //O quanto de espaço os itens ocupam
    
    public Warehouse(double capacidade){
        this.capacidade = capacidade ;
        
    }

    public double getCapacidade() {
        return capacidade;
    }

    public double getBalance() {
        return balance;
    }

    public double howMuchSpaceLeft(){
        return capacidade - balance;
    }

    public void addToWhareHouse(double amount){
        if(amount<= 0){
            System.out.println("Valor negativo, nada foi adicionado");
        }
        if(this.balance + amount > this.capacidade){
            this.balance = this.capacidade ;
        }
        this.balance += amount ;
    }

    public double takeFromWarehouse(double amount){
        if(amount <= 0 ){
            return 0;
        }
        if(amount > this.balance){
            double retirado = this.balance;
            this.balance = 0;
            return retirado;
        }
        this.balance -= amount;
        return amount;

    }
        
    @Override
    public String toString() {
        return "Warehouse [Balance=" + this.balance + ", How much space left=" + this.howMuchSpaceLeft() + "]";
    }

}

