import java.util.Scanner;

public class lendo_int {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Valor digitado:" + value);
    }
}
