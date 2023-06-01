package classes;

public class Student extends Pessoa {
    private int credito;

    public Student(String nome, String endereco){
        super(nome, endereco);
        this.credito = 0;
    }

    public int getCredito() {
        return credito;
    }

    public void estudar(){
        this.credito += 1;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
