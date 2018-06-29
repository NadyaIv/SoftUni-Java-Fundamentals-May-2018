package Exercises_P07_FoodShortage;

public class Pets implements Birthable {
   private String name;
   private String birthday;

    public Pets(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public boolean isBirthday(String year) {
        String[] birth=this.birthday.split("/");
        if(birth[2].equals(year)){
            return true;
        }
        return false;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
