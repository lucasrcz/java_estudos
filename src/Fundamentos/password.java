package Fundamentos;
import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite uma senha:");
        String senha = reader.nextLine();
        System.out.println("Digite a senha novamente:");
        String revalidacao = reader.nextLine();
        if(revalidacao.equals(senha)){
            System.out.println("Senha cadastrada com sucesso");
        }else{
            System.out.println("Senha não confere");
        }
    }
}
