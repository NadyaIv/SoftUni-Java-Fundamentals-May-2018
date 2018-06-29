package Exrecises_P03_WildFarm;

import Exrecises_P03_WildFarm.foods.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private int foodEaten;
    public Animal(String animalName, String animalType, Double animalWeight, int foodEaten) {
       setAnimalName(animalName);
        setAnimalType(animalType);
       setAnimalWeight(animalWeight);
        setFoodEaten(foodEaten);
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalWeight(Double animalWeight) {
        if(animalWeight>0){
            this.animalWeight = animalWeight;
        }

    }

    public void setFoodEaten(int foodEaten) {
        if(foodEaten>0){
            this.foodEaten = foodEaten;
        }

    }

    public String getAnimalName() {
        return this.animalName;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public Double getAnimalWeight() {
        return this.animalWeight;
    }

    public Integer getFoodEaten() {
        return this.foodEaten;
    }

    public abstract void makeSond();
    public void eat(Food food){
        this.foodEaten+=food.getQuantity();
    };
}
