package classes;

import java.util.ArrayList;
public class PacotesPresentes {
    ArrayList<Presente> presentes = new ArrayList<>();

    public PacotesPresentes(){
        this.presentes = new ArrayList<>();
    }

    public void adicionaPresentes(Presente presente){
        this.presentes.add(presente);
    }

    public void removePresente(Presente presente){
        this.presentes.remove(presente);
    }

    public double pesoTotal(){
        if(presentes.isEmpty()){
            return -1.0;
        }else{
            double somaPesos = 0;
            for(Presente presente : presentes){
                somaPesos +=presente.getPeso();
            }
            return somaPesos;
        }
    }

    public void printaLista(){
        if(presentes.isEmpty()){
            System.out.println("Lista vazia");
        }

        System.out.println("Lista de presentes:");
        for(Presente presente : this.presentes){
            System.out.println(presente);
        }
    }

    public Presente maisPesado(){
        if(presentes.isEmpty()){
            return null;
        }
        Presente maisPesado = presentes.get(0);
        for(Presente presente : this.presentes){
            if(presente.getPeso() > maisPesado.getPeso()){
                maisPesado = presente ;
            }else{
                continue;
            }
        }
    return maisPesado;
    }
}
