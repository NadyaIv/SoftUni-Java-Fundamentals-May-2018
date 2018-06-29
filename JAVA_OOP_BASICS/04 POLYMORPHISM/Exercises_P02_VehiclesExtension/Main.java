package Exercises_P02_VehiclesExtension;


import Exercises_P02_VehiclesExtension.vihecles.Bus;
import Exercises_P02_VehiclesExtension.vihecles.Car;
import Exercises_P02_VehiclesExtension.vihecles.Truck;
import Exercises_P02_VehiclesExtension.vihecles.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Vehicles> vihicles= new LinkedHashMap<>();
        String[] inputCar = reader.readLine().split(" ");
       Vehicles car = new Car(Double.parseDouble(inputCar[1]), Double.parseDouble(inputCar[2]),Double.parseDouble(inputCar[3]));
       vihicles.putIfAbsent(inputCar[0],car);
        String[] inputTruck = reader.readLine().split(" ");
        Vehicles truck = new Truck(Double.parseDouble(inputTruck[1]), Double.parseDouble(inputTruck[2]),Double.parseDouble(inputTruck[3]));
        vihicles.putIfAbsent(inputTruck[0],truck);
        String[] inputBus = reader.readLine().split(" ");
         Bus bus = new Bus(Double.parseDouble(inputBus[1]), Double.parseDouble(inputBus[2]),Double.parseDouble(inputBus[3]));
        vihicles.putIfAbsent(inputBus[0],bus);
        int num = Integer.parseInt(reader.readLine());
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < num; i++) {
            String[] inputs = reader.readLine().split(" ");
            String className = inputs[1];
            String command = inputs[0];
            double detail = Double.parseDouble(inputs[2]);
            if ("Drive".equalsIgnoreCase(command)) {
                Vehicles vehicle=vihicles.get(className);
                if(vehicle.distance(detail)){
                    System.out.printf("%s travelled %s km\n",vehicle.getClass().getSimpleName(), df.format(detail));
                }else{
                    System.out.printf("%s needs refueling\n",vehicle.getClass().getSimpleName());
                }
            } else if("Refuel".equalsIgnoreCase(command)) {
                Vehicles vehicle=vihicles.get(className);
                try {
                    vehicle.refueling(detail);
                }catch(IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                }
            }else if("DriveEmpty".equalsIgnoreCase(command)){
                if(bus.driveEmtpty(detail)){
                    System.out.printf("Bus travelled %s km\n", df.format(detail));
                }else{
                    System.out.printf("Bus needs refueling\n");
                }
            }


        }
        for (Vehicles vehicle1 : vihicles.values()) {
            System.out.println(vehicle1);
        }


    }
}
