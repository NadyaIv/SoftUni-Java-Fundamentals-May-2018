package Exercises_P02_VehiclesExtension.vihecles;

public class Bus extends Vehicles {
    public Bus(double fuelQuantity, double fuelConsumptionInLiterPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLiterPerKm, tankCapacity);
    }

    public boolean driveEmtpty(double distance){
        double consulamtion=getFuelConsumptionInLiterPerKm()-1.4;
        double kmMoving=super.getFuelQuantity()/consulamtion;
        if(distance<kmMoving){
            double consumation=this.getFuelQuantity()-distance*getFuelConsumptionInLiterPerKm();
            setFuelQuantity(consumation);
            return true;
        }
        return false;
    }
    @Override
    public void setFuelConsumptionInLiterPerKm(double fuelConsumptionInLiterPerKm) {
        super.setFuelConsumptionInLiterPerKm(fuelConsumptionInLiterPerKm+1.4);
    }

}
