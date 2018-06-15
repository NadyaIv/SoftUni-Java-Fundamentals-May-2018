package Exercises_P04_CompanyRoster;

public class Employee {
    private static final String EMAIL_CONST="n/a";
    private static final int AGE_CONST=-1;
    private String name;
    private int age;
    private double salary;
    private String position;
    private String department;
    private String email;

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {

        return this.salary;
    }

    public Employee(String name, double salary, String position, String department){
        this(name,salary,position,department,EMAIL_CONST,AGE_CONST);

    }
    public Employee(String name,double salary,String position,String department,int age){
        this(name,salary,position,department,EMAIL_CONST,age);
    }
    public Employee(String name,double salary,String position,String department,String email){
        this(name,salary,position,department,email,AGE_CONST);
    }
    public Employee(String name,double salary,String position,String department,String email,int age){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;
        this.age=age;
        this.email=email;
    }
    @Override
    public String toString(){
        return String.format("%s %.2f %s %d",this.name,this.salary,this.email,this.age);
    }
}
