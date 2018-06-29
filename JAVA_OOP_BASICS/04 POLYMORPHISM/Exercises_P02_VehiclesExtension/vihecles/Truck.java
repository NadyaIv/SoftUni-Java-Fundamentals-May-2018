package Exercises_P02_VehiclesExtension.vihecles;

public class Truck extends Vehicles{

    public Truck(double fuel, double fuelConsumation,double tankCapacity){
        super(fuel,fuelConsumation,tankCapacity);
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
    public void refueling(double liter) {
        super.refueling(0.95*liter);
    }
}
