package Exercises;

import java.util.*;

public class p11GameOfNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int num=scanner.nextInt();
        scanner.nextLine();
        Map<String,Integer> result=new LinkedHashMap<String,Integer>();
        for (int i = 0; i <num ; i++) {
          String name=scanner.nextLine();
          int initialScore=Integer.parseInt(scanner.nextLine());
          int score=initialScore;
            for (int j = 0; j <name.length() ; j++) {
                int ch=name.charAt(j);
                if(ch%2==0){
                    score+=ch;
                }else{
                    score-=ch;
                }

            }
          result.put(name,score);
        }
        int currentScore=Integer.MIN_VALUE;
        String currentName="";
        for (String s : result.keySet()) {
            if(result.get(s)>currentScore){
                currentScore=result.get(s);
                currentName=s;
            }
        }
        System.out.printf("The winner is %s - %d points",currentName,currentScore);
    }
}
