package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p06AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> result=new LinkedHashMap<>();
        while(true){
            String resource=scanner.nextLine();
            if("stop".equals(resource)){
                break;
            }
            int quantity=Integer.parseInt(scanner.nextLine());
            if(!result.containsKey(resource)){
                result.put(resource,quantity);
            }else{
               result.put(resource ,result.get(resource)+quantity);
            }
        }
        for (String s : result.keySet()) {
            System.out.printf("%s -> %d\n",s,result.get(s));
        }
    }
}
