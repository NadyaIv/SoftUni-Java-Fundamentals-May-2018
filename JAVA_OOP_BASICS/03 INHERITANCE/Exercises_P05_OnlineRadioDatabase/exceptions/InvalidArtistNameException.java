package Exercises_P05_OnlineRadioDatabase.exceptions;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String message){
        super(message);
    }
}
