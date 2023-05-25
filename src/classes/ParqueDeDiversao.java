package classes;

public class ParqueDeDiversao {
        
    private String nome;
    private int alturaMinima;

    public ParqueDeDiversao(String nome, int alturaMinima) {
        this.nome = nome;
        this.alturaMinima = alturaMinima;
    }
    
    @Override
    public String toString() {
        return this.nome + ", minimum height: " + this.alturaMinima;
    }

    public boolean permitidoEntrada(Person person){
        if(person.getAltura() < this.alturaMinima){
            return false;
        }
        return true;
    }

}
