package poo_exercicios;
import classes.simpleDate;
public class datas {
    public static void main(String[] args) {
    simpleDate d = new simpleDate(1, 2, 2000);
    System.out.println(d.equals("heh"));
    System.out.println(d.equals(new simpleDate(5, 2, 2012)));
    System.out.println(d.equals(new simpleDate(1, 2, 2000)));
    
    simpleDate d2 = new simpleDate(5, 10, 2000);
    simpleDate d3 = new simpleDate(4, 10, 2001);
    simpleDate d4 = new simpleDate(5, 10, 2000);
    System.out.println(d2.hashCode());
    System.out.println(d3.hashCode());
    System.out.println(d4.hashCode());
    }
}
