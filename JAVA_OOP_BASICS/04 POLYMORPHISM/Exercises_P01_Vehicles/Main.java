package Exercises_P01_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputCar=reader.readLine().split(" ");
        Car car = new Car(Double.parseDouble(inputCar[1]),Double.parseDouble(inputCar[2]));
        String[] inputTruck=reader.readLine().split(" ");
        Truck truck = new Truck(Double.parseDouble(inputTruck[1]),Double.parseDouble(inputTruck[2]));
        int num= Integer.parseInt(reader.readLine());
        DecimalFormat df= new DecimalFormat("#.##");
        for (int i = 0; i <num ; i++) {
            String[] inputs=reader.readLine().split(" ");
            String className=inputs[1];
            String command=inputs[0];
            double detail=Double.parseDouble(inputs[2]);
            if("Drive".equalsIgnoreCase(command)){
                if("Car".equalsIgnoreCase(className)){
                    if(car.distance(detail)){
                        System.out.printf("Car travelled %s km\n",df.format(detail));
                    }else{
                        System.out.println("Car needs refueling");
                    }
                }else{
                    if(truck.distance(detail)){
                        System.out.printf("Truck travelled %s km\n",df.format(detail));
                    }else{
                        System.out.println("Truck needs refueling");
                    }
                }
            }else{
                if("Car".equalsIgnoreCase(className)){
                    car.refueling(detail);
                }else{
                    truck.refueling(detail);
                }
            }

        }
        System.out.println(car);
        System.out.println(truck);
    }
}
