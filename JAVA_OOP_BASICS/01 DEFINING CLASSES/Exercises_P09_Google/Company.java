package Exercises_P09_Google;

public class Company {
    //•	“<Name> company <companyName> <department> <salary>”
    private String compnayName;
    private String department;
    private double salary;

    public Company(String compnayName, String department, double salary) {
        this.compnayName = compnayName;
        this.department = department;
        this.salary = salary;
    }

    public String getCompnayName() {
        return this.compnayName;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }
}
