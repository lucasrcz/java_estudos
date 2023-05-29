package poo_exercicios;

import classes.Item;
import classes.Maleta;
import classes.guardaVolume;
public class itens {

    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 3.2);
        Item phone = new Item("Nokia 3210", 0.7);
        Item tijolo = new Item("Tijolo" , 5.0);


        Maleta maleta = new Maleta(5.0);
        Maleta maletaConstrucao = new Maleta(50);
        System.out.println( maleta.getMaiorPeso());
        maleta.printaItens();
        maleta.adicionarItem(book);
        maleta.printaItens();
        maleta.adicionarItem(phone);
        maleta.printaItens();
        for(int i = 0 ; i<5 ; i++){
            maletaConstrucao.adicionarItem(tijolo);
        }
        System.out.println(maletaConstrucao.pesoTotal());
        System.out.println("maleta 2:" + maletaConstrucao.pesoTotal());
        guardaVolume volumes = new guardaVolume(70);
        System.out.println("Antes de adicionar:" + volumes.pesoTotal());
        volumes.adicionaMaleta(maletaConstrucao);
        volumes.adicionaMaleta(maleta);
        System.out.println(volumes.pesoTotal());
        volumes.imprimeObjetos();


    }
}
