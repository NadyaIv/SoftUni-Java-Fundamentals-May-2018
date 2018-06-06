package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p07ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Za-z0-9_-]{3,16}$");
        List<String> result = new ArrayList<String>();
        while (!input.equals("END")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                result.add("valid");
            } else {
                result.add("invalid");
            }
            input = scanner.nextLine();
        }
        if (result.contains("valid")) {
            for (String s : result) {
                System.out.println(s);
            }
        }
    }
}
