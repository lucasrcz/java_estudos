package classes;

public class Professor extends Pessoa {
    private double salario ;

    public Professor(String nome , String endereco ,double salario){
        super(nome,endereco);
        this.salario = salario ;
    }

    @Override
    public String toString(){
        return super.toString() + " salário:" + this.salario;
    }
}
