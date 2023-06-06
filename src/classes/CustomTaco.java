package classes;

public class CustomTaco {
    private int tacos;

    public CustomTaco (int tacos){
        this.tacos = tacos ;
    }

    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        this.tacos -=1;
    }
}
