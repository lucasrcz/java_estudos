package Fundamentos;
import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite o segundo número:");
        int n2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Resultado:" + (n1 + n2));
        scanner.close();
    }    
}
