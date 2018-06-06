package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p13OfficeStuff {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Map<String,Integer>> companies=new TreeMap<>();
        int num=Integer.valueOf(reader.readLine());
        for (int i = 0; i <num ; i++) {
            String[] inputs=reader.readLine().split("[\\|\\-\\s]+");
            companies.putIfAbsent(inputs[1],new LinkedHashMap<String,Integer>());
            companies.get(inputs[1]).putIfAbsent(inputs[3],0);
            companies.get(inputs[1]).put(inputs[3],companies.get(inputs[1]).get(inputs[3])+Integer.valueOf(inputs[2]));
        }
        companies.entrySet().stream().forEach(x-> Print(x));
    }

    private static void Print(Map.Entry<String, Map<String, Integer>> x) {
        System.out.print(x.getKey()+": ");
        /*Map<String,Integer> sortedValues=x.getValue().entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));*/
        List<String> result=new ArrayList<>();
        for (Map.Entry<String,Integer> values :x.getValue().entrySet()) {
            String value=values.getKey()+"-"+values.getValue();
            result.add(value);
        }
        String res=String.join(", ",result);
        System.out.println(res);
    }
}
