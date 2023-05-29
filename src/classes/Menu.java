package classes;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> itens ;
    
    public Menu(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item){
        if(!(itens.contains(item.toLowerCase()))){
            itens.add(item.toLowerCase());
        }else{
            System.out.println("Item duplicado");
        }
    }

    public void removerItem(String item){
        itens.remove(item.toLowerCase());
    }

    public void printMenu(){
        System.out.println("Items do menu:");
        for(String item: this.itens){
            System.out.println(item);
        }
    }

    public void resetarMenu(){
        this.itens.clear();
    }
}
