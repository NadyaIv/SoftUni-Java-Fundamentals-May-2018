package Exercises_P05_OnlineRadioDatabase;

import Exercises_P05_OnlineRadioDatabase.exceptions.InvalidSongException;
import Exercises_P05_OnlineRadioDatabase.exceptions.InvalidSongLengthException;
import Exercises_P05_OnlineRadioDatabase.exceptions.InvalidSongSecondsException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       List<Song> songs= new ArrayList<>();
       int num=Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            try {
                String[] inputs = reader.readLine().split(";");
                if (inputs.length != 3) {
                    throw new InvalidSongException();
                }
                    String nameSong = inputs[1];
                    String nameArtist = inputs[0];
                    String lenght=inputs[2];
                       Song song = new Song(nameArtist, nameSong, lenght);
                        songs.add(song);
                        System.out.println("Song added.");
            }catch (InvalidSongException iae) {
                    System.out.println(iae.getMessage());
                }
        }
            System.out.printf("Songs added: %d%n", songs.size());

            int totalSeconds = songs.stream().mapToInt(s -> s.getMinutes() * 60 + s.getSeconds()).sum();

            int hours = totalSeconds / 3600;
            totalSeconds %= 3600;
            int minutess = totalSeconds / 60;
            totalSeconds %= 60;

            System.out.printf("Playlist length: %dh %dm %ds%n", hours, minutess, totalSeconds);

    }
}
