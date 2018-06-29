package Exerises_P06_Animals;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String nameClass = reader.readLine();
            if ("Beast!".equals(nameClass)) {
                break;
            }
            String[] input = reader.readLine().split(" ");

                Animal animal = null;
                try {
                    if(input.length!=3){
                        throw new IllegalArgumentException("Invalid input!");
                    }
                    String name = input[0];
                    int age = Integer.parseInt(input[1]);
                    String gender = input[2];
                    if (nameClass.equalsIgnoreCase("Cat")) {
                        animal = new Cat(name, age, gender);
                    }else if (nameClass.equalsIgnoreCase("Dog")) {
                        animal = new Dog(name, age, gender);
                    }else if (nameClass.equalsIgnoreCase("Frog")) {
                        animal = new Frog(name, age, gender);
                    }else if (nameClass.equalsIgnoreCase("Kitten")) {
                        animal = new Kitten(name, age, gender);
                    }else if (nameClass.equalsIgnoreCase("Tomcat")) {
                        animal = new Tomcat(name, age, gender);
                    }else {
                        System.out.println("Invalid input!");
                    }
                    if(animal!=null){
                        System.out.println(animal.toString());
                        animal.produceSound();
                    }

                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            }
        }

    }
