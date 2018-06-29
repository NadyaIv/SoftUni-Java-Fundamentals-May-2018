package Exercises_P04_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public List<Product> getProducts() {
        return this.products;
    }

    private void setName(String name) {
        if (name.isEmpty() || name==null || name.matches("\\s+")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money <0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if (product.getCost()>this.money){
            throw new IllegalArgumentException(this.name+" can't afford "+product.getName());
        }
        this.products.add(product);
        setMoney(this.money-product.getCost());
        System.out.println(this.name+" bought "+product.getName());

    }
    @Override
    public String toString(){
        if(this.products.isEmpty()){
            return this.name+" - Nothing bought";
        }else{
            return String.format("%s - %s",this.name,this.products.stream().map(x->x.getName()).collect(Collectors.joining(", ")));

        }
    }
}
