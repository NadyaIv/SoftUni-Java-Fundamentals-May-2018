package Exercises;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p06MagicExchangeableWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        scanner.nextLine();
       /* int max=Math.max(first.length(),second.length());
        int lengthFirst=first.length();
        int lengthSecond=second.length();*/
       /* if(first.length()<max){
            char empty='\0';
            for (int i = 0; i <max-lengthFirst ; i++) {
                first+=empty;
            }
        }
        if(second.length()<max){
            char empty='\0';
            for (int i = 0; i <max-lengthSecond ; i++) {
                second+=empty;
            }
        }*/
        Map<Character, Character> result = new HashMap<>();
        boolean isTrue = true;
       // result.put(first.charAt(0), second.charAt(0));
        if(second.length()<first.length()) {
            for (int i = 0; i <second.length(); i++) {
                char a = first.charAt(i);
                char b = second.charAt(i);
                if (!result.containsKey(first.charAt(i))) {
                    if(result.containsValue(second.charAt(i))){
                        System.out.println("false");
                        return;
                    }else{
                        result.put(a, b);
                    }

                } else {
                    if(result.get(first.charAt(i))!=second.charAt(i)){
                        System.out.println("false");
                        return;
                    }
                }
            }
            for (int i = second.length(); i < first.length(); i++) {
                if (!result.containsKey(first.charAt(i))) {
                    System.out.println("false");
                    return;
                }
            }
        }else {
            for (int i = 0; i <first.length(); i++) {
                char a = first.charAt(i);
                char b = second.charAt(i);
                if (!result.containsKey(first.charAt(i))) {
                    if(result.containsValue(second.charAt(i))){
                        System.out.println("false");
                        return;
                    }else{
                        result.put(a, b);
                    }

                } else {
                    if(result.get(first.charAt(i))!=second.charAt(i)){
                        System.out.println("false");
                        return;
                    }
                }
            }
            for (int i = first.length(); i < second.length(); i++) {
                if (!result.containsValue(second.charAt(i))) {
                    System.out.println("false");
                    return;
                }
            }

        }
        System.out.println("true");
    }
}
