package Exercises_P05_PizzaCalories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dough {
    private static Map<String,Double> typesOfFlour=new LinkedHashMap<String,Double>();
    private List<String> typeOfFlour;
    private double weightPerGram;

    public static Map<String, Double> getTypesOfFlour() {
        return typesOfFlour;
    }

    public double getWeightPerGram() {
        return this.weightPerGram;
    }

    public List<String> getTypeOfFlour() {
        return this.typeOfFlour;
    }

    public void setTypeOfFlour(List<String> typeOfFlour) {
        for (String type : typeOfFlour) {
            if(!fillTypesOfFlour(typesOfFlour).containsKey(type)){
                throw new IllegalArgumentException("Invalid type of dough.");
            }
        }

        this.typeOfFlour = typeOfFlour;
    }

    public void setWeightPerGram(double weightPerGram) {
        if(weightPerGram<1 || weightPerGram>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weightPerGram = weightPerGram;
    }

    public static Map<String,Double> fillTypesOfFlour(Map<String,Double> typesOfFlour){
        typesOfFlour.putIfAbsent("White",1.5);
        typesOfFlour.putIfAbsent("Wholegrain",1.0);
        typesOfFlour.putIfAbsent("Crispy",0.9);
        typesOfFlour.putIfAbsent("Chewy",1.1);
        typesOfFlour.putIfAbsent("Homemade",1.0);
        return typesOfFlour;
    }


   }
