package Exercises_P03_Mankind;

public class Worker extends Human{
    private double salaryPer7days;
    private double hoursPedDay;

    public Worker(String firstname, String lastname, double salaryPer7days, double hoursPedDay) {
        super(firstname, lastname);
        this.salaryPer7days = salaryPer7days;
        this.hoursPedDay = hoursPedDay;
    }

    public double getSalaryPer7days() {
        return this.salaryPer7days;
    }

    public double getHoursPedDay() {
        return this.hoursPedDay;
    }

    public void setSalaryPer7days(double salaryPer7days) {
        if(salaryPer7days<=10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salaryPer7days = salaryPer7days;
    }

    public void setHoursPedDay(double hoursPedDay) {
        if(hoursPedDay<1 || hoursPedDay>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPedDay = hoursPedDay;
    }
public double salaryPerDay(){
        return (this.getSalaryPer7days()/7.0)/this.getHoursPedDay();
}
    @Override
    public void setLastname(String lastname) {
        if(lastname.length()<4){
throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastname(lastname);
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("First Name: ").append(super.getFirstName()).append(System.lineSeparator())
                .append("Last Name: ").append(super.getLastName()).append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f",this.getSalaryPer7days())).append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f",this.getHoursPedDay())).append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f",this.salaryPerDay()));

        return sb.toString();
    }
}
