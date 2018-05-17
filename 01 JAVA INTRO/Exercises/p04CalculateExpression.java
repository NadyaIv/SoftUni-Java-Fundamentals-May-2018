package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class p04CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double a=Double.parseDouble(scanner.next());
        double b=Double.parseDouble(scanner.next());
        double c=Double.parseDouble(scanner.next());
        double p=(a+b+c)/Math.sqrt(c);
        double f1=Math.pow((a*a+b*b)/(a*a-b*b),p);
        double f2=Math.pow((a*a+b*b-Math.pow(c,3)),a-b);
        double diff=Math.abs((a+b+c)/3-(f1+f2)/2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,diff);
    }
}
