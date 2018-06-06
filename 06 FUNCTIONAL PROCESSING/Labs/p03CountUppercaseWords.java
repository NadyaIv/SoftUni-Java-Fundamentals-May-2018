package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class p03CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text=reader.readLine().split(" ");
        Predicate<String> isEven= x->x.charAt(0)==x.toUpperCase().charAt(0);
        List<String> result=new ArrayList<String>();
        int count=0;
        for (String word : text) {
            if(isEven.test(word)){
               count++;
               result.add(word);
            }
        }
        System.out.println(count);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
