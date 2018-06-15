package Exercises_P08_PokemonTrainer;

public class Pokemon {
    //name, an element and health, all values are mandatory.
    private String name;
    private String element;
    private int health;

    public String getElement() {
        return this.element;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health -= health;
    }

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }
}
