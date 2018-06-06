package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p14SumAllValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keysString = reader.readLine();
        String textString = reader.readLine();
        //System.out.println(text);
        Pattern patternStartKey = Pattern.compile("^[a-zA-Z_]+(?=\\d)");
        Pattern patternEndKey = Pattern.compile("(?<=\\d)[a-zA-Z_]+$");
        Matcher matcherStartKey = patternStartKey.matcher(keysString);
        String startKey = "";
        Matcher matcherEndKey = patternEndKey.matcher(keysString);
        String endKey = "";
        if (matcherStartKey.find() && matcherEndKey.find()) {
            startKey = matcherStartKey.group();
            endKey = matcherEndKey.group();
        } else {
            System.out.println("<p>A key is missing</p>");
            return;
        }
        Pattern pattern = Pattern.compile(startKey+"(.*?)"+endKey);
        Matcher matcher = pattern.matcher(textString);
        double sum = 0.0;
        while (matcher.find()) {
            try{
                double number = Double.parseDouble(matcher.group(1));
                sum += number;
            }catch(Exception e){}
        }
        if (sum == 0.0) {
            System.out.println("<p>The total value is: <em>nothing</em></p>");
        } else {
            if (Math.round(sum) == sum) {
                System.out.printf("<p>The total value is: <em>%.0f</em></p>", sum);
            } else {
                System.out.printf("<p>The total value is: <em>%.2f</em></p>", sum);
            }
        }
    }
}
