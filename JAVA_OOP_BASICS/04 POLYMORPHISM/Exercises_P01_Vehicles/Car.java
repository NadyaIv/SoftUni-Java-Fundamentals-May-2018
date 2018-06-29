package Exercises_P01_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicles {
    public Car(double fuel, double fuelConsumation){
        super(fuel,fuelConsumation);
    }

    @Override
    public void setFuelConsumptionInLiterPerKm(double fuelConsumptionInLiterPerKm) {
        super.setFuelConsumptionInLiterPerKm(fuelConsumptionInLiterPerKm+0.9);
    }

    @Override
    public String toString() {

        return String.format("Car: %.2f",super.getFuelQuantity());
    }
}
