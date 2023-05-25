package classes;

public class Hospital {
    public double  pesar(Person person){
        return person.getPeso();
    }

    public void alimentar(Person person ){
        person.addPeso(1.0);
    }
}
