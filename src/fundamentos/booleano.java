import java.util.Scanner;
public class booleano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento:");
        int nascimento =Integer.valueOf(scanner.nextLine());
        System.out.println("Digite a data atual:");
        int data_atual = Integer.valueOf(scanner.nextLine());
        int idade = data_atual - nascimento;
        boolean idade_valida = idade < 0 || idade == 0  || data_atual > 2023 || nascimento > 2023;
        if(idade_valida){
            System.out.println("Data de nascimento ou Data atual inválida");
        }else{
            System.out.println("Idade válida:" + idade + " anos");
        }
    }
}
