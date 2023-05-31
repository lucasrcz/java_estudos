package classes;
import java.util.HashMap;
import java.util.ArrayList;

public class DicionarioLinguas {
    private HashMap<String, ArrayList<String>> palavras;

    

    public DicionarioLinguas() {
        this.palavras = new HashMap<>();
    }



    public void add(String palavra , String traducao){
        this.palavras.putIfAbsent(palavra, new ArrayList<>()); //Se não existir faça a palavra e um novo array;

        ArrayList<String> completed = this.palavras.get(palavra);//Pegamos o array criado
        completed.add(traducao); //Colocamos na tradução

        //O mesmo iria funcionar da seguinte forma
        //this.palavras.get(palavra).add(traducao);
    }

    public ArrayList<String> traduzir(String palavra){
        return this.palavras.get(palavra);
    }
}
