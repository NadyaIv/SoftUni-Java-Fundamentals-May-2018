package Lab_P02_Salary_Increase;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat df;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }
public void increaseSalary(double bonus){
        if(this.age<30){
            this.salary+=this.salary*bonus/200;
        }else{
            this.salary+=this.salary*bonus/100;
        }
}
@Override
    public String toString(){
   // df=new DecimalFormat("#.0################");
    //return String.format("%s %s gets %s leva",this.firstName,this.lastName,df.format(this.salary));
    return this.firstName+" "+this.lastName+" gets "+this.salary+" leva";
}
}
