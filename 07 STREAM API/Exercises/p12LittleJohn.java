package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p12LittleJohn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String smallArrow = ">----->";
        String mediumArrow = ">>----->";
        String largeArrow = ">>>----->>";
        String text="";
        for (int i = 0; i < 4; i++) {
            text+=reader.readLine()+" ";
        }
        Pattern patternLarge= Pattern.compile(">>>----->>");
        Matcher matchLarge=patternLarge.matcher(text);
        int countLargeArrow=0;
        while(matchLarge.find()){
            String matcher=matchLarge.group();
            text=text.replaceFirst(matcher," ");
            countLargeArrow++;

        }
        Pattern patternMedium= Pattern.compile(">>----->");
        Matcher matchMedium=patternMedium.matcher(text);
        int countMediumArrow=0;
        while(matchMedium.find()){
            String matcher=matchMedium.group();
            text=text.replaceFirst(matcher," ");
            countMediumArrow++;

        }
        Pattern patternSmall= Pattern.compile(">----->");
        Matcher matchSmall=patternSmall.matcher(text);
        int countSmallArrow=0;
       while(matchSmall.find()){
            String matcher=matchSmall.group();
            countSmallArrow++;

        }
        String number="";
        if(countSmallArrow!=0){
             number=String.valueOf(countSmallArrow)+String.valueOf(countMediumArrow)+String.valueOf(countLargeArrow);
        }else{
            number=String.valueOf(countMediumArrow)+String.valueOf(countLargeArrow);
        }
        String binaryNumber=Integer.toString(Integer.valueOf(number),2);
        StringBuilder sbBinary = new StringBuilder();
        sbBinary.append(binaryNumber);
        sbBinary.reverse();
        String reversedBinary=sbBinary.toString();
        String concBinary=binaryNumber+reversedBinary;
       int encryptedNumber=Integer.parseInt(concBinary,2);
        System.out.println(encryptedNumber);


    }
}
