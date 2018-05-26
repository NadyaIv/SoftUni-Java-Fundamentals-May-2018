package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p09UserLogs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Map<String,Integer>> users=new TreeMap<String,Map<String,Integer>>();

        while(true){
            String[] input=scanner.nextLine().split(" ");
            if("end".equals(input[0])){
                break;
            }
            Map<String,Integer> ips=new LinkedHashMap<>();
            String[] ipDetails=input[0].split("=");
            String ip=ipDetails[1];
            String[] userDetails=input[2].split("=");
            String user=userDetails[1];
            if(!users.containsKey(user)){
                ips.put(ip,1);
                users.put(user,ips);
            }else{
                ips=users.get(user);
                if(!ips.containsKey(ip)){
                    ips.put(ip,1);
                }else{
                    ips.put(ip,ips.get(ip)+1);
                }
                users.put(user,ips);
            }
        }
        for (Map.Entry<String,Map<String,Integer>> user : users.entrySet()) {
            System.out.printf("%s: \n",user.getKey());
            int countValues=0;
            int count=0;
            for (String s : user.getValue().keySet()) {
                countValues++;
            }

            for (String us : user.getValue().keySet()) {
                count++;
                if(count==countValues){
                    System.out.printf("%s => %d.\n",us,user.getValue().get(us));
                }else{
                    System.out.printf("%s => %d, ",us,user.getValue().get(us));
                }

            }
        }
    }
}
