package Exercises;

import java.util.Scanner;

public class p07LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs=scanner.nextLine().split("\\s+");
        String alhabet="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        double number=0;
        double sum=0;
        for (int i = 0; i <inputs.length; i++) {
            String input=inputs[i];
            char before=inputs[i].charAt(0);
            char after=inputs[i].charAt(inputs[i].length()-1);
            char beforeLower=inputs[i].toLowerCase().charAt(0);
            char afterLower=inputs[i].toLowerCase().charAt(inputs[i].length()-1);
            input=input.substring(1,input.length()-1);
            number=Double.parseDouble(input);
            int numAfter=0;
            int numBefore=0;
            for (int j = 0; j <alhabet.length() ; j++) {
                if((char)afterLower==(char)alhabet.charAt(j)){
                    numAfter=j+1;
                }
            }
            for (int j = 0; j <alhabet.length() ; j++) {
                if((char)beforeLower==(char)alhabet.charAt(j)){
                    numBefore=j+1;
                }
            }
            if((int)before-65==numBefore-1){
            number=number/numBefore;
            }else if((int)before-97==numBefore-1){
                number=number*numBefore;
            }
            if((int)after-65==numAfter-1){
                number=number-numAfter;
            }else if((int)after-97==numAfter-1){
                number=number+numAfter;
            }
            sum+=number;
        }
        System.out.printf("%.2f",sum);
    }
}
