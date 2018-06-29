package Exercises_P07_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Buyer> foods = new LinkedHashMap<>();
        int number=Integer.parseInt(reader.readLine());
        while (number!=0) {
            String[] input = reader.readLine().split(" ");
            if (input.length == 4) {
                Buyer person = new Person(input[0], Integer.valueOf(input[1]), input[2], input[3]);
                foods.putIfAbsent(input[0], person);
            } else if (input.length == 3) {
                Buyer person = new Rebel(input[0], Integer.valueOf(input[1]), input[2]);
                foods.putIfAbsent(input[0], person);
            }
            number--;
        }
        while (true) {
            String name = reader.readLine();
            if (name.equals("End")) {
                break;
            }
            if (foods.containsKey(name)) {
                if (foods.get(name).getClass().getSimpleName().equals("Person")) {
                    foods.get(name).buyFood();
                }else if(foods.get(name) instanceof Rebel){
                    foods.get(name).buyFood();
                }

            }
        }
        int count=0;
        for (Map.Entry<String, Buyer> entry : foods.entrySet()) {
            count+=entry.getValue().getFood();
        }
        System.out.println(count);
    }
}
