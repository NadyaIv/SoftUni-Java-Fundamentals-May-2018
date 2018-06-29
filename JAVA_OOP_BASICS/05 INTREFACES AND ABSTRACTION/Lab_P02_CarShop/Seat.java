package Lab_P02_CarShop;

import java.io.Serializable;

public class Seat implements Serializable,Car {
    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        setModel(model);
        setColor(color);
        setHorsePower(horsePower);
        setCountryProduced(countryProduced);
    }

    private void setModel(String model) {
        this.model = model;
    }


    private void setColor(String color) {
        this.color = color;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getCountryProduced() {
        return this.countryProduced;
    }

    private void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return "This is " + this.getModel() + " produced in " + this.getCountryProduced() + " and have " + this.TIRES + " tires";
    }
}
