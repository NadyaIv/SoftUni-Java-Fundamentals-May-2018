package Exercises_P05_OnlineRadioDatabase.exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException(String message){
        super(message);
    }
}
