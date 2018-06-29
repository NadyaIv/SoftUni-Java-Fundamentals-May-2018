package Exercises_P03_AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private void setName(String name) {
       if(name.length()==0 || name.equals(" ") || name.equals(null)){
           throw new IllegalArgumentException("Name cannot be empty.");
       }
        this.name = name;
    }

    private void setAge(int age) {
       if(age<0 || age>16){
           throw new IllegalArgumentException("Age should be between 0 and 15.");
       }
        this.age = age;
    }

    public Chicken(String name, int age) {
       setName(name);
       setAge(age);
    }
    public double calculateProductPerDay(int age){
       if(age<6){
           return 2;
       }else if(age<12){
           return 1;
       }else{
           return 0.75;
       }
    }
    @Override
    public String toString(){
        DecimalFormat df= new DecimalFormat("#.##");
        return "Chicken "+this.name+" (age "+this.age+") can produce "+df.format(calculateProductPerDay(this.age))+" eggs per day.";
    }
}
