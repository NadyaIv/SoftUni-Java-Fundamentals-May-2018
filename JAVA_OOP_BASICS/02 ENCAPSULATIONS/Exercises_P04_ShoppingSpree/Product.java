package Exercises_P04_ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    private void setName(String name) {
        if(name.isEmpty() || name== null || name.matches("\\s+")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setCost(double cost) {
        if(cost<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public Product(String name, double cost) {
       this.setName(name);
        this.setCost(cost);
    }
}
