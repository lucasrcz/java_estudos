package Fundamentos;
import java.util.Scanner;
public class methodsReat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de vezes que você quer que o método seja chamado");
        int contador = Integer.valueOf(sc.nextLine());
        if(contador == 0){
            System.out.println("Fim");
        }else{
            for(int i = 0;i<contador;i++){
                hobbit();
            }
        }
        sc.close();
    }

    public static void hobbit(){
        System.out.println("Once there was a little Hobbit...");
    }
}