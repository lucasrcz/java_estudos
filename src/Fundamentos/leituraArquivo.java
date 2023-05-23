package Fundamentos;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
public class leituraArquivo {
    public static void main(String[] args) {
        // first
        ArrayList<String> lines = new ArrayList<>();
        // in the program:

    // we create a scanner for reading the file
    try (Scanner scanner = new Scanner(Paths.get("src/poem.txt"))) {

    // we read the file until all lines have been read
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
            // we read one line
            String row = scanner.nextLine();
            // we print the line that we read
            System.out.println(row);
    }
    } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
      }
    System.out.println("Total lines: " + lines.size());
    }   
}
