package Exerises_P06_Animals;

public class Tomcat extends Animal {
    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Give me one million b***h");
    }
    @Override
    protected void setGender(String gender) {
        if(!gender.equalsIgnoreCase("Male")){
            throw new IllegalArgumentException("Invalid input!");
        }
        super.setGender(gender);
    }
}
