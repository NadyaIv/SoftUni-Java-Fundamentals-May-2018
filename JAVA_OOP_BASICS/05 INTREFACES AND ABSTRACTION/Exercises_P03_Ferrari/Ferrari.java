package Exercises_P03_Ferrari;

public class Ferrari implements Command {
    public static final String  MODEL_FERRARI="488-Spider";
    private String name;

    public Ferrari(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gasPedal() {
      return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return MODEL_FERRARI+"/"+this.brakes()+"/"+this.gasPedal()+"/"+this.name;
    }
}
