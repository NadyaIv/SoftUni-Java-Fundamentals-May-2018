package Exercises_P11_CatLady;

import java.util.List;

public class Cats {
    private String nameCat;
    private String breeds;
    private double detail;

    public Cats(String nameCat, String breeds, double detail) {
        this.nameCat = nameCat;
        this.breeds = breeds;
        this.detail = detail;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f",this.breeds,this.nameCat,this.detail);
    }
}
