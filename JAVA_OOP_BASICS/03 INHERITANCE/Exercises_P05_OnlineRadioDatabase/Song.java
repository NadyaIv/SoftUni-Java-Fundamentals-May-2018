package Exercises_P05_OnlineRadioDatabase;

import Exercises_P05_OnlineRadioDatabase.exceptions.*;

public class Song {
    private String nameArtist;
    private String nameSong;
    private int minutes;
    private int seconds;

    public void setNameArtist(String nameArtist) {
        if(nameArtist.length()<3 || nameArtist.length()>20){
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.nameArtist = nameArtist;
    }

    public void setNameSong(String nameSong) {
        if(nameSong.length()<3 || nameSong.length()>20){
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.nameSong = nameSong;
    }

    public void setLenght(String lenght)  {
        String[] inputs=lenght.split(":");
        int minutes=Integer.parseInt(inputs[0]);
        int second=Integer.parseInt(inputs[0]);
        try{
            setMinutes(minutes);
            setSeconds(seconds);
        }catch(InvalidSongLengthException iae){
            System.out.println(iae.getMessage());
        }
    }

    public void setMinutes(int minutes) {
        if(minutes<0 || minutes>14){
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds<0 || seconds>59){
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public Song(String nameArtist, String nameSong, String lenght) {
        setNameArtist(nameArtist);
        setNameSong(nameSong);
        String[] inputs = lenght.split(":");
            if (inputs.length != 2) {
                throw new InvalidSongLengthException();
            }
            try {
                int minutes = Integer.parseInt(inputs[0]);
                int seconds = Integer.parseInt(inputs[1]);
                setMinutes(minutes);
                setSeconds(seconds);
            }catch(NumberFormatException iae){
               throw new InvalidSongLengthException();
            }



    }
}
