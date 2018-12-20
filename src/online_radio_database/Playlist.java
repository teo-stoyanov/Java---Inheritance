package online_radio_database;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<Song> playlist;

    Playlist() {
        this.playlist = new ArrayList<>();
    }

    void addSongs(Song song) {
        this.playlist.add(song);
    }

    int printPlaylistSize() {
        return this.playlist.size();
    }

    @Override
    public String toString() {
        int allMinutes = playlist.stream().mapToInt(Song::getMinutes).sum();
        int allSeconds = playlist.stream().mapToInt(Song::getSeconds).sum();
        if (allSeconds > 59) {
            allMinutes += allSeconds / 60;
        }
        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;
        int seconds = allSeconds % 60;
        return String.format("Playlist length: %dh %dm %ds", hours, minutes, seconds);
    }
}
