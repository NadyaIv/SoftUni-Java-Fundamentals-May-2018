package Exrecises_P03_WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public String getLivingRegion() {
        return this.livingRegion;
    }

    public Mammal(String animalName, String animalType, Double animalWeight,int foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);

    }
    public Mammal(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }
    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat("#.##");
        return super.getAnimalName()+"["+super.getAnimalType()+", "+String.format("%s",df.format(super.getAnimalWeight()))+
                ", "+this.getLivingRegion()+", "+super.getFoodEaten()+"]";
    }
}
