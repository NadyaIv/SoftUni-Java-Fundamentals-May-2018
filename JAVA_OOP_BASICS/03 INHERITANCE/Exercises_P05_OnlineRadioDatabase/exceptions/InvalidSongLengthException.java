package Exercises_P05_OnlineRadioDatabase.exceptions;

public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException(){
        super("Invalid song length.");
    }
    public InvalidSongLengthException(String message){
        super(message);
    }
}
