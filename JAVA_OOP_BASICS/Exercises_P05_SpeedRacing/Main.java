package Exercises_P05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        Map<String, Car> cars = new LinkedHashMap<String, Car>();
        for (int i = 0; i < num; i++) {
            String[] inputs = reader.readLine().split(" ");
            Car car = new Car(inputs[0], Double.parseDouble(inputs[1]), Double.parseDouble(inputs[2]));
            cars.putIfAbsent(car.getModel(), car);
        }
        System.out.println();
        while (true) {
            String[] inputs = reader.readLine().split(" ");
            if ("End".equals(inputs[0])) {
                break;
            }
            String model = inputs[1];
            double distance = Double.parseDouble(inputs[2]);
            if (cars.containsKey(model)) {

                if (!cars.get(model).IsCarMove(distance)) {
                    System.out.println("Insufficient fuel for the drive");
                } else {
                    cars.get(model).setDistanceTraveled(distance);
                    cars.get(model).setFuelAmount(distance*cars.get(model).getFuelCost());
                }
            }
        }
        for (Car value : cars.values()) {
            System.out.println(value);
        }
    }
}
