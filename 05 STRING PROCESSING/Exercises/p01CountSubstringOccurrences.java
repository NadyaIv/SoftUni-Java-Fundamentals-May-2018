package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lines=scanner.nextLine();
        String model=scanner.nextLine();
        int count=0;
        for (int i = 0; i <lines.length(); i++) {
           try {
               String f = lines.substring(i, i + model.length());
               if (f.equalsIgnoreCase(model)) {
                   count++;
               }
           }catch(Exception e){}
        }
        System.out.println(count);

    }
}
