package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class p02UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        List<String> strings= Arrays.asList(reader.readLine().split(" "));
        strings.stream()
                .map(s->s.toUpperCase())
                .forEach(x-> System.out.print(x+" "));

    }
}
