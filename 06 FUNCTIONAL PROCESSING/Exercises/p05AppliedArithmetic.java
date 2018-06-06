package Exercises;

import javafx.scene.input.InputMethodTextRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class p05AppliedArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        BiFunction<Integer,String,Integer> applyAtithmetic=(x,y)->{
            if("add".equals(y)){
                x= x+1;
            }else if("multiply".equals(y)){
                x= 2*x;
            }else if("subtract".equals(y)){
                x= x-1;
            }
            return x;
        };
        while(true){
            String input=reader.readLine();
            if("end".equals(input)){
                break;
            }
            if("print".equals(input)){
                for (Integer number : numbers) {
                    System.out.printf( applyAtithmetic.apply(number, input)+" ");
                }
                System.out.println();

            }else {
                for (int i = 0; i <numbers.size() ; i++){
                    numbers.set(i,applyAtithmetic.apply(numbers.get(i), input));
                }
            }

        }
    }
}
