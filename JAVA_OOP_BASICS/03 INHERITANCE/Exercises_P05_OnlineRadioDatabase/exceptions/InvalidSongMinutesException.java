package Exercises_P05_OnlineRadioDatabase.exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException(String message){
        super(message);
    }
}
