package poo_exercicios;

import classes.Playlist;

public class playlists {
    public static void main(String[] args) {
        Playlist playlistA = new Playlist();

        playlistA.addSong("Pigs");
        playlistA.addSong("Dark side of the moon");
        playlistA.addSong("Cuff Link");
        playlistA.printSongs();
    }
}
