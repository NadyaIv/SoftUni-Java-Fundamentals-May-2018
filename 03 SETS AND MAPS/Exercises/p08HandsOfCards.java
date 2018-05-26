package Exercises;

import java.util.*;

public class p08HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> result = new LinkedHashMap<>();
        Map<String, Integer> types = new HashMap<String, Integer>() {{
            put("S", 4);
            put("H", 3);
            put("D", 2);
            put("C", 1);

        }};
        Map<String, Integer> powers= new HashMap<String, Integer>() {{
            put("J", 11);
            put("Q", 12);
            put("K", 13);
            put("A", 14);

        }};

        while (true) {
            String input = scanner.nextLine();
            if ("JOKER".equals(input)) {
                break;
            }
            String[] inputs = input.split(": ");
            String name = inputs[0];
            List<String> cards = Arrays.asList(inputs[1].split(", "));
            Set<String> cardsSet = new LinkedHashSet<>();
            cardsSet.addAll(cards);
            if (!result.containsKey(name)) {
                result.put(name, cardsSet);
            } else {
                result.get(name).addAll(cardsSet);
            }

        }
        for (Map.Entry<String, Set<String>> res : result.entrySet()) {
            int quantities=0;
            for (String card : res.getValue()) {
                String power = card.substring(0, card.length() - 1);
                String type = String.valueOf(card.charAt(card.length() - 1));
                int quantity=computeCardStrength(power, type,powers,types);
               quantities+=quantity;
            }
            System.out.printf("%s: %d\n",res.getKey(),quantities);

        }
    }

    private static int computeCardStrength(String power, String type, Map<String, Integer> powers, Map<String, Integer> types) {
        int pow;
        try{
            pow=Integer.parseInt(power);
        }catch(Exception e){
            pow=powers.get(power);
        }
        return pow*types.get(type);
    }

}
