package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p01TakeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens= Arrays.asList(scanner.nextLine().split(" "));
        List<Integer> numbers=new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.valueOf(token));
        }
        numbers.stream().distinct()
                .filter(n->10<=n && n<=20)
                .limit(2)
                .forEach(x-> System.out.print(x+" "));

    }
}
