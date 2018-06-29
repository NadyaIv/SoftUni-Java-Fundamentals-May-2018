package Exercises_P05_OnlineRadioDatabase.exceptions;

public class InvalidSongException extends IllegalArgumentException {
    public InvalidSongException(){
        super("Invalid song.");
    }
    public InvalidSongException(String message){
        super(message);
    }
}
