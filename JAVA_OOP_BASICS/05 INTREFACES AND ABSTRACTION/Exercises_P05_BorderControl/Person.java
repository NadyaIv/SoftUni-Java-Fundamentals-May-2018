package Exercises_P05_BorderControl;

public class Person extends Citizen {
    private String name;
    private Integer age;

    public Person( String name, Integer age,String id) {
        super(id);
        this.name = name;
        this.age = age;
    }


}
