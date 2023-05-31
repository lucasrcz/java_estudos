package classes;
import java.util.HashMap;
import java.util.ArrayList;

public class Industria {
    private HashMap<String, ArrayList<String>> industrias;

    public Industria (){
        this.industrias = new HashMap<>();
    }
    
    public void add(String unidade, String item){
        this.industrias.putIfAbsent(unidade, new ArrayList<>());

        this.industrias.get(unidade).add(item);
    }

    public ArrayList<String> printaLista(String unidade){
        if(this.industrias.get(unidade) == null){
            return new ArrayList<>();
        }
        
        return this.industrias.get(unidade);
    }
}
