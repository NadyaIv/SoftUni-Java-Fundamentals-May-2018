package Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p02SetsElements {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int countFisrtSet=Integer.parseInt(scanner.next());
    int countSecondSet=Integer.parseInt(scanner.next());
    scanner.nextLine();
    Set<String> firstSet=new LinkedHashSet<>();
    Set<String> secondSet=new LinkedHashSet<>();

        for (int i = 0; i < countFisrtSet; i++) {
            String element=scanner.nextLine();
            firstSet.add(element);
        }
        for (int i = 0; i < countSecondSet; i++) {
            String element=scanner.nextLine();
            secondSet.add(element);
        }
        int lenght=firstSet.size();
        for (int i = 0; i <lenght ; i++) {
            String element=firstSet.iterator().next();
            if (secondSet.contains(element)) {
                System.out.print(element+" ");
            }
            firstSet.remove(element);
        }


    }
}
