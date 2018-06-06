package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class p07PredicateNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.valueOf(reader.readLine());
        String[] input=reader.readLine().split(" ");
        Predicate<String> lenght= x->x.length()<=num;
        for (int i = 0; i <input.length ; i++) {
            if(lenght.test(input[i])){
                System.out.println(input[i]);
            }
        }
    }
}
