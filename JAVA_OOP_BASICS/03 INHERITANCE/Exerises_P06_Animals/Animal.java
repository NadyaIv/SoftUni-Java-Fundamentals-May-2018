package Exerises_P06_Animals;

public  class Animal {
    private String name;
    private int age;
    private String gender;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        if(age<1){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    protected void setGender(String gender) {
        if(!(gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male")) ){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public Animal(String name, int age, String gender) {
       setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void produceSound(){
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\n"+this.getName()+" "+this.getAge()+" "+this.getGender();
    }
}
