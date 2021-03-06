package Exercises_P07CarSalesman;

public class Engine {
    //model, power, displacement and efficiency
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder engine=new StringBuilder();
        engine.append(String.format("%s:",this.model)).append(System.lineSeparator())
                .append(String.format("Power: %d",this.power)).append(System.lineSeparator())
                .append(String.format("Displacement: %s",this.displacement == 0 ? "n/a" : this.displacement))
                .append(System.lineSeparator())
                .append(String.format("Efficiency: %s",this.efficiency == null ? "n/a" : this.efficiency));
        return engine.toString();
    }
}
