package Exercises;

import javafx.scene.input.InputMethodTextRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p06ReverseExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.addAll(numbers);
        int num=Integer.valueOf(reader.readLine());
        Consumer<ArrayDeque<Integer>> reverse= x->{
            int lenght=x.size();
            for (int i = 0; i <lenght; i++) {
                int element=x.poll();
                if(element%num!=0){
                    x.add(element);
                }
            }
            int length2=x.size();
            for (int i = 0; i <length2; i++) {
                System.out.print(x.pollLast()+" ");
            }
        };
        reverse.accept(deque);

    }
}
