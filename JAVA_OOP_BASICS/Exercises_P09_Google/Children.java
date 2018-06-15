package Exercises_P09_Google;

public class Children {
    //“<Name> children <childName> <childBirthday>”
    private String childrenName;
    private String childrenBirthday;

    public Children(String childrenName, String childrenBirthday) {
        this.childrenName = childrenName;
        this.childrenBirthday = childrenBirthday;
    }

    public String getChildrenName() {
        return this.childrenName;
    }

    public String getChildrenBirthday() {
        return this.childrenBirthday;
    }
}
