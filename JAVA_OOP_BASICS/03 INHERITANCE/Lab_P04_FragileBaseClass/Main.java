package Lab_P04_FragileBaseClass;

public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        Food[] food= new Food[]{new Food(),new Food() };
        predator.eatAll(food);
        System.out.println(predator.getHealth());
    }
}
