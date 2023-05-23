package Fundamentos;
import java.util.Scanner;
public class odd_or_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = Integer.valueOf(scanner.nextLine());
        if(n1 % 2 == 0){
            System.out.println("Número Par");
        }else{
            System.out.println("Número impar");
        }
    }
}
