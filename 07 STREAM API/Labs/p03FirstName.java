package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p03FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names= Arrays.asList(reader.readLine().split(" "));
        Set<Character> letters=new HashSet<Character>();
        Arrays.stream(reader.readLine().split(" ")).map(s->Character.toLowerCase(s.charAt(0))).forEach(letters::add);
        Optional<String> name=names.stream()
                .filter(x->letters.contains(x.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();
        if(name.isPresent()){
            System.out.println(name.get());
        }else {
            System.out.println("No match");
        }
    }
}
