package Exrecises_P03_WildFarm;

import Exrecises_P03_WildFarm.foods.Food;
import Exrecises_P03_WildFarm.foods.Meat;
import Exrecises_P03_WildFarm.foods.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals= new ArrayList<>();
        while (true) {
            String[] input = reader.readLine().split(" ");
            if ("End".equals(input[0])) {
                break;
            }
            String anmialType = input[0];
            String animalName = input[1];
            Double animalWieght = Double.valueOf(input[2]);
            String animalRegion = input[3];
            String catBreed = "";
            if ("Cat".equals(input[0])) {
                catBreed = input[4];
            }
            String[] foods = reader.readLine().split(" ");
            int foodQuantity = Integer.parseInt(foods[1]);
            Food food=null;
            if (foods[0].equals("Vegetable")) {
                 food = new Vegetable(foodQuantity);
            } else if (foods[0].equals("Meat")) {
               food = new Meat(foodQuantity);
            }
            Animal animal=null;
            switch (anmialType) {
                case "Mouse":
                     animal = new Mouse(anmialType, animalName, animalWieght, 0, animalRegion);
                    break;
                case "Tiger":
                    animal = new Tiger(anmialType, animalName, animalWieght, 0, animalRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(anmialType, animalName, animalWieght, 0, animalRegion);
                    break;
                case "Cat":
                    animal = new Cat(anmialType, animalName, animalWieght, 0, animalRegion, catBreed);
                    break;

            }
            animal.makeSond();
            try {
                animal.eat(food);
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            animals.add(animal);
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
