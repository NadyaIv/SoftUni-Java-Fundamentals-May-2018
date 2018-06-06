package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class p09CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> stackeven = new ArrayDeque<>();
        ArrayDeque<Integer> stackodd = new ArrayDeque<>();
        Consumer<List<Integer>> element = x -> {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) % 2 == 0) {
                    stackeven.push(x.get(i));
                } else {
                    stackodd.push(x.get(i));
                }
            }
            int[] even = new int[stackeven.size()];
            for (int i = 0; i < even.length; i++) {
                even[i] = stackeven.pop();
            }
            Arrays.sort(even);
            for (int i : even) {
                System.out.printf(i + " ");
            }
            int[] odd = new int[stackodd.size()];
            for (int i = 0; i < odd.length; i++) {
                odd[i] = stackodd.pop();
            }
            Arrays.sort(odd);
            for (int i : odd) {
                System.out.printf(i + " ");
            }
        };
        element.accept(numbers);

    }
}
