package Exercises_P04_MordorCrueltyPlan;

public class Gandalf {
   private String happiness;

    public void setHappiness(int point) {
        if(point<-5){
            this.happiness = "Angry";
        }else if(point<0){
            this.happiness = "Sad";
        }else if(point<15){
            this.happiness = "Happy";
        }else{
            this.happiness = "JavaScript";
        }
    }

    public String getHappiness() {
        return this.happiness;
    }

    public Gandalf(int point) {
        setHappiness(point);
    }
}
