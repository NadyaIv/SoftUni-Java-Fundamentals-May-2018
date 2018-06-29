package Exercises_P03_Mankind;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstname, String lastname, String facultynumber) {
        super(firstname, lastname);
        setFacultyNumber(facultynumber);
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setFacultyNumber(String facultynumber) {
        if(facultynumber.length()<5 || facultynumber.length()>10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultynumber;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("First Name: ").append(super.getFirstName()).append(System.lineSeparator())
                .append("Last Name: ").append(super.getLastName()).append(System.lineSeparator())
                .append("Faculty number: ").append(this.getFacultyNumber()).append(System.lineSeparator());

        return sb.toString();
    }
}
