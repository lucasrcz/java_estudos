package classes;

import java.util.ArrayList;

public class ParqueDeDiversao {
        
    private String nome;
    private double alturaMinima;
    private ArrayList<Person> visitantes;

    public ParqueDeDiversao(String nome, double alturaMinima) {
        this.nome = nome;
        this.alturaMinima = alturaMinima;
        this.visitantes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.nome + ", minimum height: " + this.alturaMinima + "Visitantes:" + this.visitantes;
    }

    public double calcularMediaAltura(){
        if(this.visitantes.isEmpty()){
            return -1 ;
        }

        double somaAlturas = 0;

        for(Person pessoa : visitantes){
            somaAlturas += pessoa.getAltura();
        }

        return 1.0 * somaAlturas / visitantes.size();
    }

    public boolean permitidoEntrada(Person person){
        if(person.getAltura() < this.alturaMinima){
            return false;
        }
        visitantes.add(person);
        return true;
    }

}
