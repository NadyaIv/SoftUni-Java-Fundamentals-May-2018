package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p03CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers= Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> minInteger= x->{
            int min=Integer.MAX_VALUE;
            for (Integer integer : x) {
                if(min>integer){
                    min=integer;
                }
            }
            return min;
        };
        System.out.println(minInteger.apply(numbers));
    }
}
