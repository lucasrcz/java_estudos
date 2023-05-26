package classes;

public class Hospital {
    int contador;
    public double  pesar(Person person){
        this.contador += 1;
        return person.getPeso();

    }

    public void alimentar(Person person ){
        person.addPeso(1.0);
    }

    public void mostrarContagem(){
        System.out.println("Pessoas pesadas:" + this.contador);
    }
}
