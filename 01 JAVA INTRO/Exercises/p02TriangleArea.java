package Exercises;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Scanner;

public class p02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int Ax=scanner.nextInt();
        int Ay=scanner.nextInt();
        int Bx=scanner.nextInt();
        int By=scanner.nextInt();
        int Cx=scanner.nextInt();
        int Cy=scanner.nextInt();;
        double area = Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay- By)) / 2);
        System.out.printf("%.0f",area);
    }
}
