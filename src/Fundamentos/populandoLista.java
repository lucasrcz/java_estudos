package Fundamentos;
import java.util.ArrayList;
import java.util.Scanner;
public class populandoLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> lista = new ArrayList<>();
        while(true){
            System.out.println("Digite um número:");
            int n = Integer.valueOf(sc.nextLine());
            if(n == 0){
                System.out.println("Finalziando.");
                break;
            }else{
                lista.add(n);
            }
        }
    int menor = lista.get(0);
    int maior = 0;
    for(int i = 0 ; i<lista.size() ; i++){
        if(menor > lista.get(i)) menor = lista.get(i);
        if(maior < lista.get(i)) maior = lista.get(i);
    }
    System.out.println("Maior:"+ maior);
    System.out.println("Menor:" + menor);
    sc.close();    
}
}