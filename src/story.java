import java.util.Scanner;

public class story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        String idade = scanner.nextLine();
        System.out.println("Seu nome é " + nome + " e sua idade é de " + idade);
    }
}