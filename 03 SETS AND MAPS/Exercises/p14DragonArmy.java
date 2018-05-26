package Exercises;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p14DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Map<String, Long>>> dragons = new LinkedHashMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            String type = inputs[0];
            String name = inputs[1];
            String damageCount = inputs[2];
            String healthCount = inputs[3];
            String armorCount = inputs[4];

            if (!dragons.containsKey(type)) {
                dragons.put(type,new TreeMap<>());
            }
            Map<String, Map<String, Long>> namesDragon = new TreeMap<>();
            namesDragon=dragons.get(type);
            if(!namesDragon.containsKey(name)){
                namesDragon.put(name,new TreeMap<>());
            }
            Map<String, Long> stats=new LinkedHashMap<>();
            stats=namesDragon.get(name);
            if(damageCount.equals("null")){
                stats.put("damage",45L);
            }else{
                long intdamageCount=Long.valueOf(damageCount);
                stats.put("damage",intdamageCount);
            }
            if(healthCount.equals("null")){
                stats.put("health",250L);
            }else{
                long inthealthCount=Long.valueOf(healthCount);
                stats.put("health",inthealthCount);
            }
            if(armorCount.equals("null")){
                stats.put("armor",10L);
            }else{
                long intarmorCount=Long.valueOf(armorCount);
                stats.put("armor",intarmorCount);
            }

        }

        for (Map.Entry<String, Map<String, Map<String, Long>>> entry : dragons.entrySet()) {
            double avrDamage = 0;
            double avrHealth = 0;
            double avrArmor = 0;
            long sumDamage = 0;
            long sumHealth = 0;
            long sumArmor = 0;
            long Damage = 0;
            long Health = 0;
            long Armor = 0;
            String secondline = "";
            for (Map.Entry<String, Map<String, Long>> en : entry.getValue().entrySet()) {
                for (Map.Entry<String, Long> e : en.getValue().entrySet()) {
                    if (e.getKey().equals("damage")) {
                        Damage = e.getValue();
                        sumDamage += e.getValue();
                    } else if (e.getKey().equals("health")) {
                        Health = e.getValue();
                        sumHealth += e.getValue();
                    } else if (e.getKey().equals("armor")) {
                        Armor = e.getValue();
                        sumArmor += e.getValue();
                    }

                }
                secondline += "-" + en.getKey() + " -> " + "damage: " + Damage + ", health: " + Health + ", armor: " + Armor + "\n";
            }
            avrDamage = sumDamage * 1.0 / entry.getValue().values().size();
            avrHealth = sumHealth * 1.0 / entry.getValue().values().size();
            avrArmor = sumArmor * 1.0 / entry.getValue().values().size();
            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", entry.getKey(), avrDamage, avrHealth, avrArmor);
            System.out.println(secondline.trim());
        }
    }
}
