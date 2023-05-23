package Fundamentos;
import java.util.ArrayList;
import java.util.Arrays;
public class testing {
    public static double main(String[] args) {
        ArrayList <Double> lista = new ArrayList<>(Arrays.asList(1.0,2.2,3.4,4.5,5.6,6.7,7.5,8.4,9.10,10.2));
        if(lista.size() == 0){
            return 0 ;
        }else{
            double sum = 0 ;
            for(double numero : lista){
                sum += numero;
            }
            return sum;
        }
    }
}
