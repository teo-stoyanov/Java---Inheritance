package online_radio_database.exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException(String exception) {
        super(exception);
    }
}
