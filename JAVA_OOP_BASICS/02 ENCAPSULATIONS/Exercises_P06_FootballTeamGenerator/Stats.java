package Exercises_P06_FootballTeamGenerator;

public class Stats {
    private String name;
    private double range;

    public void setName(String name) {
        this.name = name;
    }

    public void setRange(Double range) {
        if(range<0 ||range>100){
            throw new IllegalArgumentException(this.name+" should be between 0 and 100.");
        }
        this.range = range;
    }

    public Stats(String name, double range) {
        this.setName(name);
        this.setRange(range);
    }

    public String getName() {
        return this.name;
    }

    public double getRange() {
        return this.range;
    }
}
