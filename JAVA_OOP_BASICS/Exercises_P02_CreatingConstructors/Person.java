package Exercises_P02_CreatingConstructors;

public class Person {
    private static final String parameter1="No name";
    private static final int parameter2=1;
    private String name;
    private int age;
    public Person(){
        this(parameter1,parameter2);
    }
    public Person(int age){
       this(parameter1,age);
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
