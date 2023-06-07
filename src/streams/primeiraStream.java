package streams;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class primeiraStream {
    public static void main(String[] args) {
        // We initialise the scanner and the list into which the input is read
    Scanner scanner = new Scanner(System.in);
    List<String> inputs = new ArrayList<>();

    while (true) {
        String row = scanner.nextLine();
        if (row.endsWith("end")) {
            break;
        } else {
            inputs.add(row);
        }
    }

    long dividoPorTres = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(numero -> numero % 3 == 0)
    .count();

    double media = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .average()
    .getAsDouble();

    System.out.println("Números dividios por três:" + dividoPorTres);
    System.out.println("Média:" + media);
scanner.close();
}

}
