package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class p01ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs=reader.readLine().split(" ");
        Consumer<String> input= x-> System.out.println(x);
        for (String in : inputs) {
            input.accept(in);
        }

    }
}
