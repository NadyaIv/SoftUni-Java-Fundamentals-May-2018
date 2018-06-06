package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class p02SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(", ");
        Function<String, Integer> parser = x -> Integer.valueOf(x);
        int sum = 0;
        for (String input : inputs) {
            sum += parser.apply(input);
        }
        System.out.printf("Count = %d\n",inputs.length);
        System.out.printf("Sum = %d\n",sum);
    }
}
