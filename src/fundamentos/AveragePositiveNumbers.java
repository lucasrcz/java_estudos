package fundamentos;
import java.util.Scanner;
public class AveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int contador = 0;
        while(true){
            System.out.println("Digite um número:");
            int numero = Integer.valueOf(sc.nextLine());
            if(numero == 0 && contador == 0){
                System.out.println("Impossível de calcular");
                break;
            }else if(numero == 0){
                System.out.println("A soma média é de: " + Double.valueOf(sum)/contador);
                break;
            }else if(numero < 0){
                continue;
            }
        sum = sum + numero;
        contador++;
        }
    sc.close();
    }
}
