package Exercises_P04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers=reader.readLine().split(" ");
        for (int i = 0; i <numbers.length ; i++) {
            Callable number=null;
            try {
                number = new Smarthpone(numbers[i], "");
            }catch (IllegalArgumentException iae)
            {
                System.out.println(iae.getMessage());
            }
            if(number!=null) {
                System.out.println(number.calling());
            }

        }
        String[] urls=reader.readLine().split(" ");
        for (int i = 0; i <urls.length ; i++) {
            Browsable url=null;
            try {
                url = new Smarthpone("", urls[i]);
            }catch (IllegalArgumentException iae)
            {
                System.out.println(iae.getMessage());
            }
            if(url!=null) {
                System.out.println(url.browsing());
            }

        }

    }
}
