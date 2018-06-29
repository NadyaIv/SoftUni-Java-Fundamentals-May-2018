package Exercises_P01_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles {

    public Truck(double fuel, double fuelConsumation){
        super(fuel,fuelConsumation);
    }

    @Override
    public void setFuelConsumptionInLiterPerKm(double fuelConsumptionInLiterPerKm) {
        super.setFuelConsumptionInLiterPerKm(fuelConsumptionInLiterPerKm+1.6);
    }

    @Override
    public void setFuelQuantity(double fuelQuantity) {
        super.setFuelQuantity(fuelQuantity);
    }

    @Override
    public String toString() {

        return String.format("Truck: %.2f",super.getFuelQuantity());
    }

    @Override
    public void refueling(double liter) {
        super.refueling(0.95*liter);
    }
}
