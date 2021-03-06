package Exercises_P02_MultipleImplementation;


public class Citizen implements Person,Birthable,Identifiable {
    private String id;
    private String name;
    private Integer age;
    private String birthday;

    public Citizen(String name, Integer age,String id,String birthday) {
        this.name = name;
        this.age = age;
        this.id=id;
        this.birthday=birthday;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
