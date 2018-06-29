package Exercises_P04_MordorCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] foods= reader.readLine().split(" ");
        int points=0;
        for (String food : foods) {
           points+= Food.addFood(food);
        }
        Gandalf gandalf= new Gandalf(points);
        System.out.println(points);
        System.out.println(gandalf.getHappiness());
    }
}
