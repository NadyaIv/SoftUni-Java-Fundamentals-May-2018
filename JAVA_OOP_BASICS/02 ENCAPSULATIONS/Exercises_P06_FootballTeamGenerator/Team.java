package Exercises_P06_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Team {
    private String name;
    private List<Player> player;
    private double rating;

    public Team(String name) {
        this.setName(name);
        this.player = new ArrayList<>();
        this.rating = 0.0;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null || name.matches("\\s+")) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public List<Player> getPlayer() {
        return this.player;
    }

    public double getRating() {
        return this.rating;
    }

    public void removePlayer(Player player) {
        if (!this.player.contains(player)) {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", player.getName(), this.name));
        }
        this.player.remove(player);
    }

    public double calculateRatings() {
        double drange = 0;
        for (int i = 0; i < this.player.size(); i++) {
            Player pl = this.player.get(i);
            double range = pl.calculateStatPlayer();
            drange += range;
        }
        drange=drange/this.player.size();
        return Math.round(drange);
    }
}
