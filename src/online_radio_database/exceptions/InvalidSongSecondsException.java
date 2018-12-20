package online_radio_database.exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException(String exception) {
        super(exception);
    }
}
