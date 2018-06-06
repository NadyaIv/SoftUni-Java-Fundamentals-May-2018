package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class p02KnightsHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs=reader.readLine().split(" ");
        Consumer<String> input= x-> System.out.printf("Sir %s\n",x);
        for (String in : inputs) {
            input.accept(in);
        }
    }
}
