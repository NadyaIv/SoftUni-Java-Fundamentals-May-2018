package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p04CountSymbols {
    public static void main(String[] args) { 
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        Map<Character,Integer> symbols=new TreeMap<>();
        for (int i = 0; i <text.length(); i++) {
            char ch=text.charAt(i);
            if(!symbols.containsKey(ch)){
                symbols.put(ch,0);
            }
            symbols.put(ch,symbols.get(ch)+1);
        }
        for (Character character : symbols.keySet()) {
            System.out.printf("%s: %d time/s\n",character,symbols.get(character));
        }
    }
}
