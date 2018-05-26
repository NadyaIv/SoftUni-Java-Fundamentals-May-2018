package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p13SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Map<String,Long>> venues=new LinkedHashMap<>();
        long totalPrice=0;
        while(true){
            String input=scanner.nextLine();
            if("End".equals(input)){
                break;
            }
            String[] inputs=input.split(" @");
            if(inputs.length==2){
                String name=inputs[0];
                String[] details=inputs[1].split(" ");
                String venue="";
                boolean isString=true;
                int price=0;
                int count=0;
                if(details.length>=3) {
                    for (int i = 0; i < details.length - 2; i++) {
                        if (Character.isLetter(details[i].charAt(0))) {
                            venue += details[i] + " ";
                        } else {
                            isString = false;
                        }
                    }
                    venue.trim();
                    if (Character.isDigit(details[details.length - 2].charAt(0)) &&
                            Character.isDigit(details[details.length - 1].charAt(0)) &&
                            isString) {
                        price = Integer.parseInt(details[details.length - 2]);
                        count = Integer.parseInt(details[details.length - 1]);
                        totalPrice = price * count;
                        Map<String, Long> singer = new LinkedHashMap<>();
                        if (!venues.containsKey(venue)) {
                            singer.put(name, totalPrice);
                            venues.put(venue, singer);
                        } else {
                            singer = venues.get(venue);
                            if (!singer.containsKey(name)) {
                                singer.put(name, totalPrice);

                            } else {
                                singer.put(name, singer.get(name) + totalPrice);
                            }
                            venues.put(venue, singer);
                        }

                    }
                }
            }
        }
        for (Map.Entry<String,Map<String,Long>> venue : venues.entrySet()) {
            System.out.println(venue.getKey());
            Map<String,Long> sortedSinger=venue.getValue().entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).
                    collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            for (Map.Entry<String,Long> singer : sortedSinger.entrySet()) {
                System.out.printf("#  %s -> %d\n",singer.getKey(),singer.getValue());
            }
        }

    }
}
