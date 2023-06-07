package streams;

import java.util.ArrayList;
import java.util.Scanner;


public class streamsPositivasNegativas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while(true){
            String input = sc.nextLine();
            if(input.endsWith("end")) break;
            else lista.add(input);
        }
    System.out.println("Deseja ver a média dos números positivos ou negativos?(p/n)");
    String input = sc.nextLine();
    if(input.toLowerCase().equals("p")){
        double positivo = lista.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(numero -> numero > 0)
        .average()
        .getAsDouble();
        System.out.println("Média dos números positivos: " + positivo);
    }else{
        double negativo = lista.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(numero -> numero < 0)
        .average()
        .getAsDouble();
        System.out.println("Média dos números negativos: " + negativo);
    }
sc.close();    
}
}
