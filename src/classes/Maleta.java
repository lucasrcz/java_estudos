package classes;

import java.util.ArrayList;

public class Maleta {
    private ArrayList<Item> itens;
    private double pesoMaximo;

    public Maleta(double maximo){
        this.itens = new ArrayList<>();
        this.pesoMaximo = maximo ;
    }

    public double pesoTotal(){
        double pesoTotal = 0;
        for(Item item : this.itens){
            pesoTotal += item.getPeso();
        }
        return pesoTotal;
    }

    public void adicionarItem(Item item){
        if(this.pesoMaximo >= (this.pesoTotal() + item.getPeso())){
            System.out.println("Item adicionado:" + item.getNome());
            this.itens.add(item);
        }else{
            System.out.println("Item não adicionado");
        }
    }

    public void printaItens(){
        if(this.itens.isEmpty()){
            System.out.println("Maleta vazia");
        }else{
            double pesoTotal = 0;
            for(Item item : this.itens){
                System.out.println(item.getNome() + "(" + item.getPeso() + " KG)");
                pesoTotal += item.getPeso();
            }
            System.out.println("Peso total:" + "(" + String.format("%.2f",pesoTotal) +  ")");
        }
    }
    public double getMaiorPeso(){
        if(this.itens.isEmpty()){
            return 0;
        }     
        double maiorPeso = this.itens.get(0).getPeso();
        for(Item item : this.itens){
            if(maiorPeso < item.getPeso()){
                maiorPeso = item.getPeso();
            }else{
                continue;
            }
        }
        return maiorPeso;
    }
}