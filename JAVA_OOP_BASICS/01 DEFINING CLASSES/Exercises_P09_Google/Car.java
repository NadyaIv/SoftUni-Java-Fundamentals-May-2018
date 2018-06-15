package Exercises_P09_Google;

public class Car {
    //“<Name> car <carModel> <carSpeed>”
    private String carModel;
    private int carSpeed;

    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public int getCarSpeed() {
        return this.carSpeed;
    }
}
