package classes;

import java.util.HashMap;

public class RegistroDePlacas{

    private HashMap <LicensePlate,String> registros ;


    public RegistroDePlacas() {
        this.registros = new HashMap<>();
    }

    public void addProprietario(String proprietario , LicensePlate placa){
        if(this.registros.containsKey(placa)){
            System.out.println("Placa já adicionada.");
        }else{
            this.registros.put(placa, proprietario);
        }
    }

    public String get(LicensePlate placa){
        return this.registros.get(placa);
    }

    public boolean remove(LicensePlate placa){
        if(this.registros.remove(placa) == null){
            return false;
        }else{
            return true;
        }
    }

    public void printaPlacas(){
        for(LicensePlate key : this.registros.keySet()){
            System.out.println(key);
        }
    }

    public void printaProprietarios(){
        this.registros.values().stream().distinct().forEach(System.out::println);
    }
}
