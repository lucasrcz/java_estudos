package fundamentos;
import java.util.Scanner;
public class condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = Integer.valueOf(scanner.nextLine());
        if(idade <18){
            System.out.println("Menor de idade!");
        }else{
            System.out.println("Maior de idade!");
        }
        scanner.close();
    }
}
