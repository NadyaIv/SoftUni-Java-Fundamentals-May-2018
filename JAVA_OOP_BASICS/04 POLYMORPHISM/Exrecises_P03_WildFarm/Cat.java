package Exrecises_P03_WildFarm;

import Exrecises_P03_WildFarm.foods.Food;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSond() {
        System.out.println("Meowwww");
    }
    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat("#.##");
        return super.getAnimalName()+"["+super.getAnimalType()+", "+this.breed+", "+String.format("%s",df.format(super.getAnimalWeight()))+
                ", "+this.getLivingRegion()+", "+super.getFoodEaten()+"]";
    }
}
