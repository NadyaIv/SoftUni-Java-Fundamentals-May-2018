package Exercises_P09_Google;

public class Parents {
    //<Name> parents <parentName> <parentBirthday>
    private String parentName;
    private String parentBirthday;

    public Parents(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    public String getParentName() {
        return this.parentName;
    }

    public String getParentBirthday() {
        return this.parentBirthday;
    }
}
