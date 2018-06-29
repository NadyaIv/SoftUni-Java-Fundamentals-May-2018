package Exrecises_P03_WildFarm;

import Exrecises_P03_WildFarm.foods.Food;

import java.text.DecimalFormat;

public  class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSond() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Vegetable")) {
           throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
      super.eat(food);
    }

}
