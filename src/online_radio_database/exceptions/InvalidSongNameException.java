package online_radio_database.exceptions;

import online_radio_database.exceptions.InvalidSongException;

public class InvalidSongNameException extends InvalidSongException {
    public InvalidSongNameException(String exception) {
        super(exception);
    }
}
