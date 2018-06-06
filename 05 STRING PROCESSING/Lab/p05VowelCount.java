package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05VowelCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String vowels="AOEIUYaoiuye";
        Pattern pattern=Pattern.compile("[AOEIUYaoiuye]");
        Matcher matcher=pattern.matcher(input);
        int count=0;
        while(matcher.find()){
            count++;
        }
        System.out.printf("Vowels: %d",count);
    }
}
