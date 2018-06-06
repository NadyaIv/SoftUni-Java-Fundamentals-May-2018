package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p07MapDistricts {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,List<Integer>> towns=new LinkedHashMap<>();
        String[] line=reader.readLine().split(" ");
        for (int i = 0; i <line.length ; i++) {
            String[] input=line[i].split(":");
            String city=input[0];
            int population=Integer.valueOf(input[1]);
            towns.putIfAbsent(city,new ArrayList<>());
            towns.get(city).add(population);
        }
        int limits=Integer.valueOf(reader.readLine());
        towns.entrySet().stream().filter(x->x.getValue().stream().mapToInt(Integer::valueOf).sum()>=limits)
                .sorted((c,d)->Integer.compare(d.getValue().stream().mapToInt(Integer::valueOf).sum(),
                c.getValue().stream().mapToInt(Integer::valueOf).sum())).forEach(p07MapDistricts::Print);

    }
    private static void Print(Map.Entry<String, List<Integer>> x) {
        System.out.print(x.getKey()+": ");
        List<Integer> sortedPopulation=x.getValue().stream().sorted((z,y)->Integer.compare(y,z)).limit(5).collect(Collectors.toList());
        for (Integer integer : sortedPopulation) {
            System.out.print(integer+ " ");
        }
        System.out.println();

    }

}
