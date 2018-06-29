package Lab_P03_ValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private void setFirstName(String firstName){
        if(firstName.length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName=firstName;
    }
    private void setLastName(String lastName){
        if(lastName.length()<3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName=lastName;
    }
    private void setAge(int age){
        if(age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age=age;
    }
    private void setSalary(double salary){
        if(salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary=salary;
    }
    public Person(String firstName,String lastName,int age,double salary){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }
    public void increaseSalary(double bonus){
        if(this.age<30){
            setSalary(this.salary+this.salary*bonus/200);
        }else{
            setSalary(this.salary+this.salary*bonus/100);
        }
    }
    @Override
    public String toString(){
        // df=new DecimalFormat("#.0################");
        //return String.format("%s %s gets %s leva",this.firstName,this.lastName,df.format(this.salary));
        return this.firstName+" "+this.lastName+" gets "+this.salary+" leva";
    }
}
