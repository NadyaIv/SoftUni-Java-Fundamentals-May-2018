package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p09MatchFullName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            String input=scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
            Matcher matcher =pattern.matcher(input);
            if(matcher.find()){
                System.out.println(input);
            }
        }
    }
}
