package classes;

import java.util.ArrayList;

public class guardaVolume {
    private double pesoMaximo ;
    private ArrayList<Maleta> maletas;

    public guardaVolume(double pesoMaximo){
        this.pesoMaximo = pesoMaximo;
        this.maletas = new ArrayList<>();
    }

    public double pesoTotal(){
        double pesoTotal = 0;
        for(Maleta maleta : this.maletas){
            pesoTotal += maleta.pesoTotal();
        }
        return pesoTotal;
    }

    public void adicionaMaleta(Maleta maleta){
        if(this.pesoMaximo >= (this.pesoTotal() + maleta.pesoTotal())){
            this.maletas.add(maleta);
        }else{
            System.out.println("Impossível de adicionar maleta");
        }
    }

    public void imprimeObjetos(){
        System.out.println("Os itens nas maletas são:");
        for(Maleta maleta : this.maletas){
            maleta.printaItens();
        }
    }

    @Override
    public String toString(){
        return this.maletas.size() + "(" + this.pesoTotal() + " KG)";
    }
}
