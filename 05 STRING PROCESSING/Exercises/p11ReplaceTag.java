package Exercises;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p11ReplaceTag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        while(!input.equals("END")){
            sb.append(input);
            sb.append("\n");
            input=scanner.nextLine();
        }
        String line=sb.toString().trim();
       // System.out.println(line);
        Pattern pattern= Pattern.compile("<a href=(.+?)>(\\s*.+?)<\\/a>");
        Matcher matcher = pattern.matcher(line);
        while(matcher.find()){
        String first=matcher.group(1);
           // System.out.println(first);
        String second =matcher.group(2);
            //System.out.println(second);
       line=line.replace(matcher.group(),"[URL href="+first+"]"+second+"[/URL]");

        }
        System.out.println(line);

    }
}
