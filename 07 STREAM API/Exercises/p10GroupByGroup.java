package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class p10GroupByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,List<String>> students=new LinkedHashMap<>();
        while(true){
            String input=reader.readLine();
            if("END".equals(input)){
                break;
            }
            String[] inputs=input.split(" ");
            String firstName=inputs[0];
            String lastName=inputs[1];
            String name=firstName+" "+lastName;
            int group=Integer.valueOf(inputs[2]);
            students.putIfAbsent(group,new ArrayList<>());
            students.get(group).add(name);
        }
        students.entrySet().stream().sorted((a,b)->Integer.compare(a.getKey(),b.getKey())).forEach(x->print(x));

    }

    private static void print(Map.Entry<Integer, List<String>> x) {
        System.out.printf("%s - %s",x.getKey(),String.join(", ",x.getValue()));
        System.out.println();
    }
}
