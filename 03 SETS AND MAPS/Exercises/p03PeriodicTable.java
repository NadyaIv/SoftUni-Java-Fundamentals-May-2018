package Exercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03PeriodicTable {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int count=Integer.parseInt(scanner.nextLine());
            Set<String> components=new TreeSet<String>();
        for (int i = 0; i <count; i++) {
            String[] inputs=scanner.nextLine().split(" ");
            for (int j = 0; j <inputs.length ; j++) {
                components.add(inputs[j]);
            }
        }
        for (String component : components) {
            System.out.print(component+" ");
        }
    }
}
