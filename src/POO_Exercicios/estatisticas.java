package POO_Exercicios;
import java.util.Scanner;
import Classes.Estatistica;

public class estatisticas {
 public static void main(String[] args) {
    Estatistica estatisticaTeste = new Estatistica();
    estatisticaTeste.adicionaNumero(15);
    estatisticaTeste.adicionaNumero(12);
    estatisticaTeste.adicionaNumero(13);
    estatisticaTeste.adicionaNumero(53);
    System.out.println("Soma:" + estatisticaTeste.getSoma());
    System.out.println("Contagem:" + estatisticaTeste.getContagem());
    System.out.println("Media:" +estatisticaTeste.media());

    Scanner sc = new Scanner(System.in);
    Estatistica estatisticaUser = new Estatistica();
    for(int i = 0 ; i < 3; i++){
        System.out.println("Digite o número:");
        estatisticaUser.adicionaNumero(Integer.valueOf(sc.nextLine()));
    }
    System.out.println("Soma:" + estatisticaUser.getSoma());
    System.out.println("Contagem:" + estatisticaUser.getContagem());
    System.out.println("Media:" +estatisticaUser.media());
    sc.close();
    }
}