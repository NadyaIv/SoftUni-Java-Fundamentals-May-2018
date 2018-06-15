package Exercises_P06_RawData;

public class Cars {
    private String model;
    private Engines engine;
    private Cargos cargo;
    private Tires tire;

    public Engines getEngine() {
        return this.engine;
    }

    public String getModel() {

        return this.model;
    }

    public Tires getTire() {

        return this.tire;
    }

    public Cargos getCargo() {
        return this.cargo;
    }

    public Cars(String model, Engines engine, Cargos cargo, Tires tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }
}
