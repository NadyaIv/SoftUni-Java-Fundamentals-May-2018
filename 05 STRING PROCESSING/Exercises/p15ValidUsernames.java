package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p15ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] inputs=scanner.nextLine().split("[/\\\\()\\s+]+");
        List<String> usernames=new ArrayList<String>();
        Pattern pattern= Pattern.compile("^[a-zA-Z][a-z-A-Z0-9_]{2,24}$");
        for (int i = 0; i <inputs.length ; i++) {
            Matcher matcher=pattern.matcher(inputs[i]);
            if(matcher.find()){
                usernames.add(matcher.group());
            }
        }
        int sum=0;
        int prevousSum=0;
        String firstElement="";
        String secondElement="";
        for (int i = 0; i < usernames.size()-1; i++) {
            prevousSum=usernames.get(i).length()+usernames.get(i+1).length();
            if(sum<prevousSum){
                sum=prevousSum;
                firstElement=usernames.get(i);
                secondElement=usernames.get(i+1);
            }
        }
        System.out.println(firstElement);
        System.out.println(secondElement);

    }
}
