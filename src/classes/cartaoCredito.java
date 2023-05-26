package classes;

import fundamentos.booleano;

public class cartaoCredito {
    private double saldo;

    public cartaoCredito(double balance){
        this.saldo = balance;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void adicionarSaldo(double acrecentar){
        this.saldo = this.saldo + acrecentar;
    }

    public boolean sacar(double saque){
        if(this.saldo<saque){
            return false;
        }else{
            this.saldo -= saque;
            return true;
        }
    }

}
