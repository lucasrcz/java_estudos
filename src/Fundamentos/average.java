package Fundamentos;
import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite um segundo número:");
        int n2 = Integer.valueOf(scanner.nextLine());
        double media = (double) (n1 + n2)/2;
        System.out.println("A média é:" + media);
    }
}
