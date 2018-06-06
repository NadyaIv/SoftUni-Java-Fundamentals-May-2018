package Exercises;

import java.util.Scanner;

public class p08MelrahShake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder word=new StringBuilder(scanner.nextLine());
        String pattern=scanner.nextLine();
        while(true ) {
            int lenght = pattern.length();
            int index = word.indexOf(pattern);
            int lastIndex = word.lastIndexOf(pattern);
            if (index == -1 ||  lastIndex==-1 || pattern.isEmpty()) {
                System.out.println("No shake.");
                System.out.println(word.toString());
                return;
            } else {
                word.delete(index,index+pattern.length());
                lastIndex = word.lastIndexOf(pattern);
                word.delete(lastIndex, lastIndex + pattern.length());
                System.out.println("Shaked it.");
            }
            int ch = lenght / 2;
            StringBuilder sb = new StringBuilder(pattern);
            sb.delete(ch, ch + 1);
            pattern = sb.toString();
        }


    }
}
