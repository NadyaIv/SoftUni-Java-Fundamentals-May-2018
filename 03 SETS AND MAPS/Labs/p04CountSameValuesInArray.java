package Labs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p04CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr= scanner.nextLine().split(" ");
        Map<String,Integer> maps=new HashMap<>();
        for (String ar : arr) {
            if(!maps.containsKey(ar)){
                maps.put(ar,0);
            }
            maps.put(ar,maps.get(ar)+1);
        }
        for (String aDouble : maps.keySet()) {
            System.out.printf("%s - %d times\n",aDouble,maps.get(aDouble));
        }
    }
}
