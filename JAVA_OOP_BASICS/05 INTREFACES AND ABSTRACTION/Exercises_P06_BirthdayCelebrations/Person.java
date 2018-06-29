package Exercises_P06_BirthdayCelebrations;


public class Person extends Citizen implements Birthable{
    private String name;
    private Integer age;
    private String birthday;


    public Person( String name, Integer age,String id,String birthday) {
        super(id);
        this.name = name;
        this.age = age;
        this.birthday=birthday;
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
