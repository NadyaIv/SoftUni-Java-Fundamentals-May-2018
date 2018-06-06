package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p08FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers= Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> maxElement= x->{
            int index=0;
            int max=Integer.MAX_VALUE;
            for (int i = 0; i <x.size() ; i++) {
                if (max >= x.get(i)) {
                    max=x.get(i);
                    index=i;
                }
            }
            return index;
        };
        System.out.println(maxElement.apply(numbers));
    }
}
