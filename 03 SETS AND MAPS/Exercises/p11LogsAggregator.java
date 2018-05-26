package Exercises;

import java.util.*;

public class p11LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        Map<String,Set<String>> ipsNames=new TreeMap<String,Set<String>>();
        Map<String,Integer> durations=new TreeMap<String,Integer>();
        for (int i = 0; i <num ; i++) {
            String[] input=scanner.nextLine().split(" ");
            String name=input[1];
            String ip=input[0];
            int duration=Integer.parseInt(input[2]);
            Set<String> ips=new TreeSet<>();
            if(!ipsNames.containsKey(name)){
                ips.add(ip);
                ipsNames.put(name,ips);
            }else{
                ips=ipsNames.get(name);
                ips.add(ip);
                ipsNames.put(name,ips);
            }
            if (!durations.containsKey(name)) {
                durations.put(name,0);
            }
            durations.put(name,durations.get(name)+duration);
        }
        for (Map.Entry<String,Set<String>> names : ipsNames.entrySet()) {
            System.out.printf("%s: %d %s\n",names.getKey(),durations.get(names.getKey()),names.getValue());
        }
    }
}
