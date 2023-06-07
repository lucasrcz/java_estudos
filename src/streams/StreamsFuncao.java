package streams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamsFuncao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        while(true){
            String input = sc.nextLine();
            if(input.toLowerCase().equals("end")) break;
            else numeros.add(Integer.valueOf(input));
        }

        ArrayList<Integer> divisivel = divisivel(numeros);
        System.out.println("Numéros divisiveis por 2,3 ou 5: ");
        sc.close();

        divisivel.stream()
        .forEach(num -> System.out.println(num));
    }

    public static ArrayList<Integer> divisivel (ArrayList<Integer> numbers){
        ArrayList<Integer> lista= numbers.stream()
        .map(Integer::valueOf)
        .filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
        .collect(Collectors.toCollection(ArrayList::new));

        return lista;
    }
}
