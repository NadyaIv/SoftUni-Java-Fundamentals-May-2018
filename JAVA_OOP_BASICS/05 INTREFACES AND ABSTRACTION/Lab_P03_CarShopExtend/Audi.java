package Lab_P03_CarShopExtend;

public class Audi implements Rentable{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced,Integer minRentDay,Double pricePerDay) {
        setModel(model);
        setColor(color);
        setHorsePower(horsePower);
        setCountryProduced(countryProduced);
        setMinRentDay(minRentDay);
        setPricePerDay(pricePerDay);
    }

    public void setMinRentDay(Integer minRentDay) {
        this.minRentDay = minRentDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    private void setModel(String model) {
        this.model = model;
    }


    private void setColor(String color) {
        this.color = color;
    }

    private void setHorsePower(Integer horsePower) {
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

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double  getPricePerDay() {
        return this.pricePerDay;
    }
}
