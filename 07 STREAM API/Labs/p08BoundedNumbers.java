package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p08BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] bounders=reader.readLine().split(" ");
        int lowerBound=Math.min(Integer.valueOf(bounders[0]),Integer.valueOf(bounders[1]));
        int upperBound=Math.max(Integer.valueOf(bounders[0]),Integer.valueOf(bounders[1]));
        List<Integer> numbers= Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt)
        .filter(x->(lowerBound<=x && x<=upperBound)).boxed().collect(Collectors.toList());
        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
    }
}
