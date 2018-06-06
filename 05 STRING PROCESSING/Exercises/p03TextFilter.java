package Exercises;

import java.util.Scanner;

public class p03TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] bannedWords=scanner.nextLine().split(", ");
        String text=scanner.nextLine();
        for (int i = 0; i <bannedWords.length ; i++) {
            String banWord=bannedWords[i];
            String stars="";
            for (int j = 0; j <banWord.length(); j++) {
                stars+="*";
            }
           while(text.contains(banWord)){
                text=text.replace(banWord,stars);
           }
        }
        System.out.println(text);
    }
}
