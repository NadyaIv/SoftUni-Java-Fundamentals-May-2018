package Lab_P01_SingleInheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

    }
}
