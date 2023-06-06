package classes;

import java.util.ArrayList;

public class Box implements Empacotavel {
    private ArrayList<Empacotavel> itens ;
    private double pesoMaximo;
    public Box(double pesoMaximo){
        this.itens = new ArrayList<Empacotavel>() ;
        this.pesoMaximo = pesoMaximo;
    }

    public void add(Empacotavel item){
        if(this.pesoMaximo >= (this.pesar() + item.pesar())){
            itens.add(item);
        }else{
            System.out.println("Item não adicionado");
        }
    }

    public double pesar(){
        double peso = 0;
        for(Empacotavel item : this.itens){
            peso += item.pesar();
        }
        return peso;
    }

    public String toString(){
        return "Box: " + itens.size() + "Itens, peso total:" + this.pesar();
    }
}
