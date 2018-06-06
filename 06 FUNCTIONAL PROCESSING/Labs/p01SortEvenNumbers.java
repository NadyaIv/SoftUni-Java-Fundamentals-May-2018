package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p01SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers= Arrays.stream(reader.readLine().split("[,|\\s]")).collect(Collectors.toList());
        List<Integer> result=new ArrayList<Integer>();
        numbers.removeIf(n->n.isEmpty());
        for (String integer : numbers) {
            int m=Integer.parseInt(integer);
            result.add(m);
        }
        result.removeIf(n->n%2!=0);
        System.out.printf(result.toString().replaceAll("[\\[\\]]",""));
        result.sort((a,b)->a.compareTo(b));
        System.out.println();
        System.out.printf(result.toString().replaceAll("[\\[\\]]",""));
    }
}
