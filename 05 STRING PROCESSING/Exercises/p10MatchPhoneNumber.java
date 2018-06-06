package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p10MatchPhoneNumber {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    while(true) {
        String input = scanner.nextLine();
        if(input.equals("end")){
            break;
        }
        Pattern pattern = Pattern.compile("^\\+359( |-)2\\1[0-9]{3}\\1[0-9]{4}$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    }
}
