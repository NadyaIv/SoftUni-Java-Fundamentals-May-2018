package Exercises_P01_Vehicles;

public class Vehicles {
    private double fuelQuantity;
    private double fuelConsumptionInLiterPerKm;

    public Vehicles(double fuelQuantity,double fuelConsumptionInLiterPerKm){
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionInLiterPerKm(fuelConsumptionInLiterPerKm);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumptionInLiterPerKm(double fuelConsumptionInLiterPerKm) {
        this.fuelConsumptionInLiterPerKm = fuelConsumptionInLiterPerKm;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getFuelConsumptionInLiterPerKm() {
        return this.fuelConsumptionInLiterPerKm;
    }

    public boolean distance(double distance){
        double kmMoving=this.fuelQuantity/this.fuelConsumptionInLiterPerKm;
        if(distance<kmMoving){
            double consumation=this.getFuelQuantity()-distance*getFuelConsumptionInLiterPerKm();
            setFuelQuantity(consumation);
            return true;
        }
        return false;
    }
    public  void refueling(double liter){
      double consumation=this.getFuelQuantity()+liter;
      setFuelQuantity(consumation);
    }

}
