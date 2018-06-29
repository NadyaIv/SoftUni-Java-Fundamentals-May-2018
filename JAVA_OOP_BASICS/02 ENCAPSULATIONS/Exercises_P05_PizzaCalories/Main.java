package Exercises_P05_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputsPizzaDetail=reader.readLine().split(" ");
        String namePizza=inputsPizzaDetail[1];
        int countOfToppings=Integer.parseInt(inputsPizzaDetail[2]);
        Pizza pizza = new Pizza();
        try{
            pizza.setName(namePizza);
            pizza.isValidCountOfToppings(countOfToppings);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            return;
        }
        String[] inputsDough=reader.readLine().split(" ");
        List<String> types=new ArrayList<>();
        for (int i = 1; i <inputsDough.length-1 ; i++) {
           types.add(inputsDough[i]);
        }
        double weight=Double.parseDouble(inputsDough[inputsDough.length-1]);
        Dough dough= new Dough();
        try{
            dough.setTypeOfFlour(types);
            dough.setWeightPerGram(weight);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
            return;
        }
        List<Topings> top= new ArrayList<>();
        for (int i = 0; i <countOfToppings ; i++) {
            String[] toppings=reader.readLine().split(" ");
            String nameOfTopping= toppings[1];
            double weightOfTopping=Double.parseDouble(toppings[2]);
            Topings topping=null;
            try {
               topping = new Topings(nameOfTopping, weightOfTopping);
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
                return;
            }
            top.add(topping);
        }
        pizza.setDough(dough);
        pizza.setTopings(top);
        pizza.calculateCalories();
        System.out.println(pizza);
    }
}
