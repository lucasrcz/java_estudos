package Fundamentos;
import java.util.Scanner;
public class gift_tax {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Digite o valor do seu presente:");
    double presenteValor = Double.valueOf(reader.nextLine());
    if(presenteValor >= 5000 && presenteValor < 25000){
        double taxa = 100 + ((presenteValor - 5000) * 0.08) ;
        System.out.println("Sua taxa é de:" + taxa );
    }else if( presenteValor>=25000 && presenteValor <55000){
        double taxa = 1700 + ((presenteValor - 25000) * 0.1) ;
        System.out.println("Sua taxa é de:" + (taxa));
    }else if(presenteValor>= 200000 && presenteValor <1000000){
        double taxa = 22100 + ((presenteValor - 200000) * 0.15);
        System.out.println("Sua taxa é de:" + (taxa ));
    }else if(presenteValor>= 1000000){
        double taxa = 142100 + ((presenteValor - 1000000 ) * 0.17);
        System.out.println("Sua taxa é de:" + (taxa));
    }else{
        System.out.println("No tax!");
    }
    reader.close();
    }
}
