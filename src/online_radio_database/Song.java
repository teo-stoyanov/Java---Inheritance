package online_radio_database;

import online_radio_database.exceptions.InvalidSongLengthException;
import online_radio_database.exceptions.InvalidSongMinutesException;
import online_radio_database.exceptions.InvalidSongNameException;
import online_radio_database.exceptions.InvalidSongSecondsException;

class Song {
    private static final String SONG_NAME_EXCEPTION_MSG = "Song name should be between 3 and 30 symbols.";
    private static final String ARTIST_NAME_EXCEPTION_MSG = "Artist name should be between 3 and 20 symbols.";
    private static final String SONG_LENGTH_EXCEPTION_MSG = "Invalid song length.";
    private static final String SONG_MINUTES_EXCEPTION_MSG = "Song minutes should be between 0 and 14.";
    private static final String SONG_SECONDS_EXCEPTION_MSG = "Song seconds should be between 0 and 59.";

    private String name;
    private String artist;
    private int minutes;
    private int seconds;

    Song(String artist, String name, int minutes, int seconds) {
        this.setArtist(artist);
        this.setName(name);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
        this.setSongLen();
    }

    private void setName(String name) {
        if (name.length() < 3 || name.length() > 20) {
            throw new InvalidSongNameException(SONG_NAME_EXCEPTION_MSG);
        }
        this.name = name;
    }

    private void setArtist(String artist) {
        if (artist.length() < 3 || artist.length() > 20) {
            throw new InvalidSongNameException(ARTIST_NAME_EXCEPTION_MSG);
        }
        this.artist = artist;
    }

    private void setSongLen() {
        if (this.minutes == 0 && this.seconds == 0) {
            throw new InvalidSongLengthException(SONG_LENGTH_EXCEPTION_MSG);
        }
    }

    private void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException(SONG_MINUTES_EXCEPTION_MSG);
        }
        this.minutes = minutes;
    }

    private void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException(SONG_SECONDS_EXCEPTION_MSG);
        }
        this.seconds = seconds;
    }

    int getMinutes() {
        return this.minutes;
    }

    int getSeconds() {
        return this.seconds;
    }
}
