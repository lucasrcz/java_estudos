package poo_exercicios;
import classes.Person;
import classes.Song;

public class musicas {
    public static void main(String[] args) {
        Song musica1 = new Song("Get Back", 167);
        System.out.println("O nome da canção:"+ musica1.retornaNome() + ", com a duração(segundos) de:" + musica1.retornaDuracao());

        Song musica2 = musica1;

        System.out.println(musica1.equals(musica2)); //Retorna verdadeiro pois a música 2 aponta para o endereço da música 1

        Song musica3 = new Song("I am the Walrus", 240);

        System.out.println(musica1.equals(musica3));

        Song musica4 = new Song("Get back", 167); 

        Person pessoa1 = new Person("Lucas", 27);

        System.out.println("Uma pessoa com uma música, que comparação estranha:" + musica1.equals(pessoa1));

        System.out.println(musica4.equals(musica1)); //Retorna pois tem os mesmos atributos
    }



}
