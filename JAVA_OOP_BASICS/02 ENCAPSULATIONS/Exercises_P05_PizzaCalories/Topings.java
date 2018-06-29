package Exercises_P05_PizzaCalories;

import java.util.LinkedHashMap;
import java.util.Map;

public class Topings {
    private static Map<String,Double> typesOfToppings=new LinkedHashMap<String,Double>();
    private String typeOfTopping;
    private double weightPerGram;

    public String getTypeOfTopping() {
        return this.typeOfTopping;
    }

    public double getWeightPerGram() {
        return this.weightPerGram;
    }

    public void setTypeOfTopping(String typeOfTopping) {
        if(!fillTypesOfToppings(typesOfToppings).containsKey(typeOfTopping)){
            throw new IllegalArgumentException("Cannot place "+typeOfTopping+" on top of your pizza.");
        }
        this.typeOfTopping = typeOfTopping;
    }

    public void setWeightPerGram(double weightPerGram) {
        if(weightPerGram<1 || weightPerGram>50){
            throw new IllegalArgumentException(this.typeOfTopping+" weight should be in the range [1..50].");
        }
        this.weightPerGram = weightPerGram;
    }

    public Topings(String typeOfTopping, double weightPerGram) {
        this.setTypeOfTopping(typeOfTopping);
        this.setWeightPerGram(weightPerGram);
    }

    public static Map<String,Double> fillTypesOfToppings(Map<String,Double> typesOfFlour){
        typesOfFlour.putIfAbsent("Meat",1.2);
        typesOfFlour.putIfAbsent("Veggies",0.8);
        typesOfFlour.putIfAbsent("Cheese",1.1);
        typesOfFlour.putIfAbsent("Sauce",0.9);
        return typesOfFlour;
    }
}
