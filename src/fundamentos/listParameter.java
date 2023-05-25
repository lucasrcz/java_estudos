package fundamentos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class listParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você quer iniciar em qual índice? [1 a 10]");
        int inicio = Integer.valueOf(sc.nextLine());
        System.out.println("Você quer terminar em qual índice?[1 a 10]");
        int fim = Integer.valueOf(sc.nextLine());
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        printListRange(lista, inicio, fim);
        sc.close();
    }
    public static void printListRange(ArrayList<Integer> lista ,int inicio, int fim){
        for(int i = (inicio -1) ; i<fim ; i++){
            System.out.println(lista.get(i));
        }
    }
}
