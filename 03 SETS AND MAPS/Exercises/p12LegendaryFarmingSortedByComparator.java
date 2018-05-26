package Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class p12LegendaryFarmingSortedByComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendaries = new TreeMap<>();
        legendaries.put("shards", 0);
        legendaries.put("fragments", 0);
        legendaries.put("motes", 0);
        Map<String, Integer> junks = new TreeMap<>();
        while (true) {
            String[] materials = scanner.nextLine().split(" ");
            for (int i = 0; i < materials.length - 1; i += 2) {
                int quantity = Integer.parseInt(materials[i]);
                String material = materials[i + 1].toLowerCase();
                if (legendaries.containsKey(material)) {
                    legendaries.put(material, legendaries.get(material) + quantity);
                    if (legendaries.get(material) >= 250) {
                        legendaries.put(material, legendaries.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.print("Shadowmourne obtained!\n");
                        } else if (material.equals("fragments")) {
                            System.out.print("Valanyr obtained!\n");
                        } else if (material.equals("motes")) {
                            System.out.print("Dragonwrath obtained!\n");
                        }
                        Map<String,Integer> sortedLegendaries=legendaries.entrySet().stream().
                                sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).
                                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
                       /* Comparator<Map.Entry<String, Integer>> compareByQuantity = Comparator.comparing(Map.Entry::getValue
                                , Comparator.reverseOrder());
                        Comparator<Map.Entry<String, Integer>> compareByName = Comparator.comparing(Map.Entry::getKey);
                        legendaries.entrySet().stream().sorted(compareByQuantity.thenComparing(compareByName)).
                                forEach((a) -> {
                                    System.out.printf("%s: %d\n", a.getKey(), a.getValue());
                                });*/
                        for (Map.Entry<String, Integer> legendary : sortedLegendaries.entrySet()) {
                            System.out.printf("%s: %d\n",legendary.getKey(),legendary.getValue());
                        }
                        for (Map.Entry<String, Integer> junk : junks.entrySet()) {
                            System.out.printf("%s: %d\n", junk.getKey(), junk.getValue());
                        }
                        return;
                    }
                } else {
                    if(!junks.containsKey(material)){
                        junks.put(material,0);
                    }
                    junks.put(material,junks.get(material)+ quantity);
                }
            }
        }
    }
}