package Exercises_P08_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //name, number of badges and a collection of pokemon
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void setBadges(int badges) {
         this.badges+=badges;
    }

    public int getBadges() {
        return this.badges;
    }

    public String getName() {
        return this.name;
    }

    public Trainer(String name, int badges, List<Pokemon> pokemons){
        this.name=name;
        this.badges=badges;
        this.pokemons=pokemons;
    }
}
