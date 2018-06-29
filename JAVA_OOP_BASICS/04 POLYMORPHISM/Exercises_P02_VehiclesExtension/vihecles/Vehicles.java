package Exercises_P02_VehiclesExtension.vihecles;

public class Vehicles {
    private double fuelQuantity;
    private double fuelConsumptionInLiterPerKm;
    private double tankCapacity;

    public Vehicles(double fuelQuantity, double fuelConsumptionInLiterPerKm, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionInLiterPerKm(fuelConsumptionInLiterPerKm);
        setTankCapacity(tankCapacity);
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getTankCapacity() {
        return this.tankCapacity;
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

    public boolean distance(double distance) {
        double kmMoving = this.fuelQuantity / this.fuelConsumptionInLiterPerKm;
        if (distance < kmMoving) {
            double consumation = this.getFuelQuantity() - distance * getFuelConsumptionInLiterPerKm();
            setFuelQuantity(consumation);
            return true;
        }
        return false;
    }

    public void refueling(double liter) {
        if (liter <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        double consumation = this.getFuelQuantity() + liter;
        if (consumation > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        setFuelQuantity(consumation);

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
