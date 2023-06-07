package streams;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class collectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> lista = new ArrayList<>();

        while(true){
            String input = sc.nextLine();
            if(input.toLowerCase().equals("end"))break;
            else lista.add(input);
        }
        List<Integer> positivos = lista.stream()
        .map(Integer::valueOf)
        .filter(number -> number > 0)
        .collect(Collectors.toList());
    
        sc.close();
        System.out.println(positivos);
    }
}
