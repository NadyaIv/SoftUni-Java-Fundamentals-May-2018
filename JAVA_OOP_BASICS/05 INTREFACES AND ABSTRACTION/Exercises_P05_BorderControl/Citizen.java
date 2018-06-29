package Exercises_P05_BorderControl;

public abstract class Citizen {
    private String id;

    public Citizen(String id) {
        this.id = id;
    }

    public boolean isId(String end){
       if(this.id.endsWith(end)){
           return true;
       }
       return false;
    }

    public String getId() {
        return this.id;
    }
}
