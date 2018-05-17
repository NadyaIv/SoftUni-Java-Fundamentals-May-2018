package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class p01RectangleArea {
    public static void main(String[] args) {
        System.out.printf("%.2f",calculateArea());

    }
    private static double calculateArea(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double sideA=scanner.nextDouble();
        double sideB=scanner.nextDouble();
        double area=sideA*sideB;
        return area;
    }
}
