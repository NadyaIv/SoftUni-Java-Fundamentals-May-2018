package Exercises_P03_Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        Command car= new Ferrari(name);
        System.out.println(car);
    }
}
