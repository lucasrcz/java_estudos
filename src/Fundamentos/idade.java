package Fundamentos;
import java.util.Scanner;
import java.util.ArrayList;
public class idade {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Digite o nome e idade:");
            String input = sc.nextLine();
            if(input.equals("")){
                break;
            }
            String[] partes = input.split(",");
            sum = sum + Integer.valueOf(partes[1]);
            nomes.add(partes[0]);
        }
        System.out.println("Soma de todas as idades:" + sum);
        System.out.println("Nomes da lista:");
        for(String nome : nomes){
            System.out.println(nome);
        }
        sc.close();
    }
}
