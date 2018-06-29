package Exrecises_P03_WildFarm;

import Exrecises_P03_WildFarm.foods.Food;

public  class Tiger extends Feline {
    public Tiger(String animalName, String animalType, Double animalWeight, int foodEaten,String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten,livingRegion);
    }

    private String livingRegion;
    @Override
    public void makeSond() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
