package Exercises;


import java.util.Scanner;

public class p04UnicodeCharacters {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <input.length(); i++) {
            char ch =input.charAt(i);
            String hex = String.format("\\u%04x", (int) ch);
            System.out.print(hex);
        }
    }
}
