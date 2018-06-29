package Exercises_P02_VehiclesExtension.vihecles;

public class Car extends Vehicles {
    public Car(double fuel, double fuelConsumation,double tankCapacity){
        super(fuel,fuelConsumation,tankCapacity);
    }

    @Override
    public void setFuelConsumptionInLiterPerKm(double fuelConsumptionInLiterPerKm) {
        super.setFuelConsumptionInLiterPerKm(fuelConsumptionInLiterPerKm+0.9);
    }

}
