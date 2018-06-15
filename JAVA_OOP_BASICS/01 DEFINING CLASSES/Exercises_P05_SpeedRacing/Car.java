package Exercises_P05_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0.0;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount -= fuelAmount;
    }

    public double getFuelCost() {
        return this.fuelCost;
    }

    public double getFuelAmount() {

        return this.fuelAmount;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }

    public String getModel() {

        return this.model;
    }

    public boolean IsCarMove(double distance){
      double fuel=this.fuelAmount-(this.fuelCost*distance);
      if(fuel>=0){
          return true;
      }else{
          return false;
      }
    }
    @Override
    public String toString(){
        return String.format("%s %.2f %.0f",this.model,this.fuelAmount,this.distanceTraveled);
    }
}
