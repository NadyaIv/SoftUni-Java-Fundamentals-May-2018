package Exercises_P07_FoodShortage;

public class Rebel implements Buyer {
    private String name;
    private Integer age;
    private String group;
    private Integer food;

    public Rebel(String name, Integer age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }
@Override
    public int getFood() {
        return this.food;
    }

    @Override
    public void buyFood() {
         this.food+=5;
    }
}
