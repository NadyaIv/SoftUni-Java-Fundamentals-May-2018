package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06ExtractTags {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            String input=scanner.nextLine();
            if(input.equalsIgnoreCase("END")){
                break;
            }
            Pattern pattern= Pattern.compile("<.*?>");
            Matcher matcher=pattern.matcher(input);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
