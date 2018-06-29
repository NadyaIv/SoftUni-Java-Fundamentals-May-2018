package Exercises_P03_Mankind;

public class Human {
    private String firstName;
    private String lastName;

    public void setFirstname(String firstname) {
        if(firstname.charAt(0)!=firstname.toUpperCase().charAt(0)){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if(firstname.length()<4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firstName = firstname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastname(String lastname) {
        if(lastname.charAt(0)!=lastname.toUpperCase().charAt(0)){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if(lastname.length()<3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastname;
    }

    public Human(String firstname, String lastname) {
        setFirstname(firstname);
        setLastname(lastname);
    }
}
