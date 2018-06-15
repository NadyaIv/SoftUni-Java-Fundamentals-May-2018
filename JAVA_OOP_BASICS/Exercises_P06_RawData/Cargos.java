package Exercises_P06_RawData;

public class Cargos {

    private int cargoWeight;
    private String cargoType;

    public String getCargoType() {
        return this.cargoType;
    }

    public Cargos(int cargoWeight, String cargoType) {

        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }
}
