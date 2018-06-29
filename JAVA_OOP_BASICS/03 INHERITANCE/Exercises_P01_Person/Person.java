package Exercises_P01_Person;

public class Person {
    private String name;
    private int age;

    protected void setName(String name) {
        if(name.length()<3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    protected void setAge(int age) {
        if(age<1){
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }
/*public Person(){
        this.name=null;
        this.age=0;
}*/
    public Person(String name, int age) {
       this.setName(name);
        this.setAge(age);
    }
    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d",this.name,this.age);
    }
}
