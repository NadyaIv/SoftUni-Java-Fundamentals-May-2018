package Exercises_P05_PizzaCalories;

import java.util.LinkedHashMap;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topings> topings;

    public String getName() {
        return this.name;
    }

    public Dough getDough() {
        return this.dough;
    }

    public List<Topings> getTopings() {
        return this.topings;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.length() > 16) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public boolean isValidCountOfToppings(int count) {
        if (count > 10 || count < 0) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        return true;
    }

    public void setTopings(List<Topings> topings) {
        if (topings.size() > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.topings = topings;
    }

    public double calculateCalories() {
        double callories = 0;
        double doughCallories = 1;
        double toppingCallories = 0;
        for (String dough : this.getDough().getTypeOfFlour()) {
            doughCallories *= Dough.fillTypesOfFlour(new LinkedHashMap<String, Double>()).get(dough);
        }
        doughCallories =2*this.getDough().getWeightPerGram() * doughCallories;
        for (int i = 0; i < this.getTopings().size(); i++) {
            Topings toping = this.getTopings().get(i);
            toppingCallories +=2* toping.getWeightPerGram() * Topings.fillTypesOfToppings(new LinkedHashMap<>()).get(toping.getTypeOfTopping());
        }
        callories = doughCallories + toppingCallories;
        return callories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",this.getName(),this.calculateCalories());
    }
}
