package Fundamentos;
import java.util.Scanner;
public class whileexercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros_lidos = 0;
        int soma = 0;

        while(true){
            if(numeros_lidos == 5){
                break;
            }
            System.out.println("Digite um número:");
            soma = soma + Integer.valueOf(sc.nextLine());
            numeros_lidos = numeros_lidos + 1;
        }
        System.out.println("O número somado é de:" + soma);
        sc.close();
    }
}
