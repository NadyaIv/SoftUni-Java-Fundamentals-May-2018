package Exercises;

import java.util.Scanner;

public class p02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String firstNumber=scanner.nextLine().replaceFirst("^([0]+)", "");
        String secondNumber=scanner.nextLine().replaceFirst("^0+(?!$)", "");
        StringBuilder sb=new StringBuilder();
        int max=Math.max(firstNumber.length(),secondNumber.length());
        if(firstNumber.length()<max){
            String empty="";
            for (int i = 0; i <max-firstNumber.length() ; i++) {
                empty+="0";
            }
            firstNumber=empty+firstNumber;
        }
        if(secondNumber.length()<max){
            String empty="";
            for (int i = 0; i <max-secondNumber.length() ; i++) {
                empty+="0";
            }
            secondNumber=empty+secondNumber;
        }
        int sum=0;
        int lastDigit=0;
        int firstDigit=0;
        for (int i =max-1; i >=0; i--) {
            int first=firstNumber.charAt(i)-48;
            int second=secondNumber.charAt(i)-48;
           lastDigit=(first+second+firstDigit)%10;
           firstDigit=(first+second+firstDigit)/10;
            sb.insert(0,lastDigit);
        }
        if(firstDigit>0){
            sb.insert(0,firstDigit);
        }
        System.out.println(sb.toString());
    }

}
