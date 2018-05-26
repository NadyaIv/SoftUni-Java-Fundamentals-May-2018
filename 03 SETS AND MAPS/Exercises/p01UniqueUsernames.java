package Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
           int count=Integer.parseInt(scanner.nextLine());
           Set<String> sets=new LinkedHashSet<String>();
        for (int i = 0; i <count ; i++) {
            sets.add(scanner.nextLine());
        }
        for (String set : sets) {
            System.out.println(set);
        }
    }
}
