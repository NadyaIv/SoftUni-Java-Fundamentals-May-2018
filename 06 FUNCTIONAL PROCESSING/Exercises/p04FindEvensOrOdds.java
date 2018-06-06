package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class p04FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Predicate<Integer> odd=x->x%2!=0;
       Predicate<Integer>even=x->x%2==0;
        int[] bounded= Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String format=reader.readLine();
        for (int i = bounded[0]; i <=bounded[1] ; i++) {
            if("odd".equals(format) && odd.test(i)){
                System.out.print(i+" ");
            }else if("even".equals(format) && even.test(i)){
                System.out.print(i+" ");
            }
        }
    }
}
