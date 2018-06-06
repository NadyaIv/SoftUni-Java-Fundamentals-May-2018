package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p10ListPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number= Integer.valueOf(reader.readLine());
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        BiPredicate<Integer,List<Integer>> isdivisible= (x,y)->{
            for (int i = 0; i <y.size() ; i++) {
                if(x%y.get(i)!=0){
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <=number; i++) {
            if(isdivisible.test(i,numbers)){
                System.out.print(i+" ");
            }
        }

    }
}
