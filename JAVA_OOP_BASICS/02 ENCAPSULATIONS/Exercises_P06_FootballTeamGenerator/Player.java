package Exercises_P06_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Stats> stat;

    public Player(String name) {
this.setName(name);
this.stat= new ArrayList<>();
    }

    public Player(String name, List<Stats> stat) {
        this.setName(name);
        this.setStat(stat);
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null || name.matches("\\s+")) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void setStat(List<Stats> stat) {
        this.stat = stat;
    }

    public String getName() {
        return this.name;
    }

    public List<Stats> getStat() {
        return this.stat;
    }

    public double calculateStatPlayer() {
        double range = 0.0;
        for (int i = 0; i < this.stat.size(); i++) {
            double statRange = this.stat.get(i).getRange();
            range += statRange;
        }
        range = range / 5;
        return range;
    }
}
