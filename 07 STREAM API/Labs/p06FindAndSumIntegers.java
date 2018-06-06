package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class p06FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OptionalInt digits= Arrays.asList(reader.readLine().split(" ")).stream()
                .filter(x->!x.isEmpty())
        .filter(x->isNumber(x))
        .mapToInt(Integer::parseInt)
                .reduce((x,y)->(x+y));
        if(digits.isPresent()){
            System.out.println(digits.getAsInt());
        }else{
            System.out.println("No match");
        }
    }

    private static boolean isNumber(String string) {
        char[] chars=string.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i] == '+' || chars[i] == '-') {
                continue;
            }else if(!Character.isDigit(chars[i])){
                   return false;
            }
        }
        return true;
    }
}
