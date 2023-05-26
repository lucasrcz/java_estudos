package poo_exercicios;

import classes.cartaoCredito;

public class cartoes {
    public static void main(String[] args) {
        cartaoCredito cartaoLucas = new cartaoCredito(20.0);
        System.out.println("saldo:" + cartaoLucas.getSaldo());
        System.out.println("Saque:" + cartaoLucas.sacar(10));
        System.out.println("Saque" + cartaoLucas.getSaldo()); 
    }
}
