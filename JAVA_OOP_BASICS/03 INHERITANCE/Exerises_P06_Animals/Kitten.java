package Exerises_P06_Animals;

public class Kitten extends Animal {
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Miau");
    }
    @Override
    protected void setGender(String gender) {
        if(!gender.equalsIgnoreCase("Female")){
            throw new IllegalArgumentException("Invalid input!");
        }
        super.setGender(gender);
    }
}
