package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class p07CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String firstWord=scanner.next();
        String secondWord=scanner.next();
        int minLength=Math.min(firstWord.length(),secondWord.length());
        int sum=0;
        for (int i = 0; i <minLength ; i++) {
            char first=firstWord.charAt(i);
            char second=secondWord.charAt(i);
            int multy=first*second;
            sum+=multy;
        }
        if(firstWord.length()>minLength){
            for (int i = minLength; i <firstWord.length() ; i++) {
                char third=firstWord.charAt(i);
                sum+=third;
            }
        }
        if(secondWord.length()>minLength){
            for (int i = minLength; i <secondWord.length() ; i++) {
                char third=secondWord.charAt(i);
                sum+=third;
            }
        }
        System.out.println(sum);
    }
}
