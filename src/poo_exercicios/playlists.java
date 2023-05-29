package poo_exercicios;

import classes.Playlist;
import classes.Song;

public class playlists {
    public static void main(String[] args) {
        Playlist playlistA = new Playlist();
        Song musica1 = new Song("Pigs", 18);
        Song musica2 = new Song("Dark side of the moon",3);
        Song musica3 = new Song("Cuff Link", 3);

        playlistA.addSong("Pigs");
        playlistA.addSong("Dark side of the moon");
        playlistA.addSong("Cuff Link");
        playlistA.printSongs();
    }
}
