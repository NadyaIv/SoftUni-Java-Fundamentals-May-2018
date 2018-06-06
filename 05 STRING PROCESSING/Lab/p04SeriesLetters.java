package Lab;

import java.util.Scanner;

public class p04SeriesLetters {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        String result=String.valueOf(input.charAt(0));
        int state=0;
        for (int i = 0; i <input.length()-1; i++) {
            char letter=input.charAt(i);
            char nextLetter=input.charAt(i+1);
            if(letter==nextLetter){
            continue;
            }else{
                result+=nextLetter;
            }

        }
        System.out.println(result);
    }
}
