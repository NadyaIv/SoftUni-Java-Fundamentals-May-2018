package Exercises_P07_FoodShortage;


public class Person extends Citizen implements Birthable,Buyer {
    private String name;
    private Integer age;
    private String birthday;
    private Integer food;


    public Person( String name, Integer age,String id,String birthday) {
        super(id);
        this.name = name;
        this.age = age;
        this.birthday=birthday;
        this.food=0;
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

    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
