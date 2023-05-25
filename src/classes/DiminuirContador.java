package classes;


public class DiminuirContador {
    private int value;   // a variable that remembers the value of the counter

    public DiminuirContador(int initialValue) {
        this.value = initialValue;
    }

    public void mostraValor() {
        System.out.println("value: " + this.value);
    }

    public void diminuir() {
       if(this.value  > 0){
        this.value -= 1 ;
       }else{
        System.out.println("Valor igual a 0 , não pode ser decrementado");
       }
    }

    public void resetar(){
        this.value = 0 ;
    }

    // and the other methods go here
}