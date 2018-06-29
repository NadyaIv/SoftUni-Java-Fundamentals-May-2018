package Lab_P04_FragileBaseClass;

import java.util.List;

public class Predator extends Animal{
    private int health;

    public  void feed(Food food){
super.eat(food);
this.health++;
    }
    public int getHealth() {
        return this.health;
    }
    @Override
    public void eatAll(Food[] food){
        for (Food food1 : food) {
            this.feed(food1);
        }
    }
}
