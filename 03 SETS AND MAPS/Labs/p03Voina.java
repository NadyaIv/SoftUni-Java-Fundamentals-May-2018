package Labs;

import java.util.*;

public class p03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> deckFirstPlayer = new LinkedHashSet<>();
        Set<String> deckSecondPlayer = new LinkedHashSet<>();
        String[] fPlayer = scanner.nextLine().split(" ");
        String[] sPlayer =scanner.nextLine().split(" ");;
        Collections.addAll(deckFirstPlayer,fPlayer);
        Collections.addAll(deckSecondPlayer,sPlayer);
        int count=0;
       while(count<50){
           count++;
           int first=Integer.valueOf(deckFirstPlayer.iterator().next());
           int second=Integer.valueOf(deckSecondPlayer.iterator().next());
           deckFirstPlayer.remove(String.valueOf(first));
           deckSecondPlayer.remove(String.valueOf(second));
           if(first>second){
            deckFirstPlayer.add(String.valueOf(first));
            deckFirstPlayer.add(String.valueOf(second));
           }else if(first<second){
              deckSecondPlayer.add(String.valueOf(first));
              deckSecondPlayer.add(String.valueOf(second));
           }
           if(deckFirstPlayer.isEmpty() || deckSecondPlayer.isEmpty()){
               break;
           }

       }
       if(deckFirstPlayer.size()>deckSecondPlayer.size()){
           System.out.println("First player win!");
       }else if(deckFirstPlayer.size()<deckSecondPlayer.size()) {
           System.out.println("Second player win!");
       }else{
           System.out.println("Draw!");
       }
    }
}
