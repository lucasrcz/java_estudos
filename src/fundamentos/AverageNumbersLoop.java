package fundamentos;
import java.util.Scanner;
public class AverageNumbersLoop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int  i =0;
       int soma = 0; 
       int contador = 0 ;
       while(i<5){
        System.out.println("Digite um número:");
        int numero = Integer.valueOf(sc.nextLine());
        if(numero == 0){
            i = i + 1;
            continue;
        }else{
            i = i + 1;
            soma = soma + numero;
            contador = contador + 1;
        }
       }
       double media = Double.valueOf(soma) / contador ;
       System.out.println("A média dos números foi de:" + media);
       System.out.println("A quantidade de números somados foi de:" + contador);
       sc.close();
    }
}
