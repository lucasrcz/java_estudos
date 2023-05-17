import java.util.ArrayList;
import java.util.Arrays;
public class lista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Lucas","Daniel","Carlos","Oscar","Mariano","Raquel"));
        for(int i = lista.size()-1;i>-1 ; i--){
            System.out.println(lista.get(i));
        }
        System.out.println("Primeiro nome:" + lista.get(0));
        System.out.println("Ultimo nome:" + lista.get(lista.size()-1));
    }
}
