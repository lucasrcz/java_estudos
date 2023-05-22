import POO.Song;

public class musicas {
    public static void main(String[] args) {
        Song musica1 = new Song("Get Back", 167);
        System.out.println("O nome da canção:"+ musica1.retornaNome() + ", com a duração(segundos) de:" + musica1.retornaDuracao());
    }
}
