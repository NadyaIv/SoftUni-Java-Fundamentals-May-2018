package Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p05Palindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] inputs=scanner.nextLine().split("[!,.?\\s+]+");
        List<String> result=new ArrayList<String>();
        for (int i = 0; i <inputs.length ; i++) {
           String first=inputs[i];
           String reversed="";
            for (int j = first.length()-1; j >=0; j--) {
                reversed+=first.charAt(j);
            }
            if(first.equals(reversed) && !result.contains(first)){
                result.add(first);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
