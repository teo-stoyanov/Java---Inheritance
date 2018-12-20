package online_radio_database;

import online_radio_database.exceptions.InvalidSongException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Playlist playlist = new Playlist();
        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String artist;
            String songName;
            int minutes;
            int seconds;
            try {
                String[] input = console.readLine().split(";");
                int[] time = Arrays.stream(input[2].split(":")).mapToInt(Integer::parseInt).toArray();
                artist = input[0];
                songName = input[1];
                minutes = time[0];
                seconds = time[1];
            } catch (Exception ose) {
                System.out.println("Invalid song length.");
                continue;
            }
            try {
                Song song = new Song(artist, songName, minutes, seconds);
                playlist.addSongs(song);
                System.out.println("Song added.");
            } catch (InvalidSongException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(String.format("Songs added: %d", playlist.printPlaylistSize()));
        System.out.println(playlist);
    }
}
