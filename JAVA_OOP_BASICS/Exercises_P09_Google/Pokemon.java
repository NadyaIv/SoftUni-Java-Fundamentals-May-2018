package Exercises_P09_Google;

public class Pokemon {
    //“<Name> pokemon <pokemonName> <pokemonType>”
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public String getPokemonName() {
        return this.pokemonName;
    }

    public String getPokemonType() {
        return this.pokemonType;
    }
}
