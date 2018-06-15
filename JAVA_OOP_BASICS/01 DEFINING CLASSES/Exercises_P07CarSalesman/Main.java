package Exercises_P07CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Engine> engines=new LinkedHashMap<>();
        List<Car> cars= new ArrayList<>();
        int numberOfEngine=Integer.valueOf(reader.readLine());
        for (int i = 0; i <numberOfEngine ; i++) {
            String[] input=reader.readLine().split(" ");
            Engine engine=null;
            switch(input.length){
                case 2:
                    engine=new Engine(input[0],Integer.parseInt(input[1]));
                    break;
                case 3:
                    if(Character.isDigit(input[2].charAt(0))){
                        engine=new Engine(input[0],Integer.parseInt(input[1]),Integer.parseInt(input[2]));
                    }else{
                        engine=new Engine(input[0],Integer.parseInt(input[1]),input[2]);
                    }
                    break;
                case 4:
                    engine=new Engine(input[0],Integer.parseInt(input[1]),Integer.parseInt(input[2]),input[3]);
                    break;
            }
            engines.putIfAbsent(input[0],engine);
        }
        int numberOfCar=Integer.valueOf(reader.readLine());
        for (int i = 0; i <numberOfCar ; i++) {
            String[] input=reader.readLine().split(" ");
            Car car=null;
            switch(input.length){
                case 2:
                   car=new Car(input[0],engines.get(input[1]));
                    break;
                case 3:
                    if(Character.isDigit(input[2].charAt(0))){
                        car=new Car(input[0],engines.get(input[1]),Integer.parseInt(input[2]));
                    }else{
                        car=new Car(input[0],engines.get(input[1]),input[2]);
                    }
                    break;
                case 4:
                   car=new Car(input[0],engines.get(input[1]),Integer.parseInt(input[2]),input[3]);
                    break;
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car);
        };
    }
}
