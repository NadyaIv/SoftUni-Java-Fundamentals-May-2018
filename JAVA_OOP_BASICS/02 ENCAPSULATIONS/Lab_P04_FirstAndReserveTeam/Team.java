package Lab_P04_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reverseTeam;

    public Team(String name){
        this.name=name;
        this.firstTeam= new ArrayList<>();
        this.reverseTeam= new ArrayList<>();

    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReverseTeam() {
        return Collections.unmodifiableList(this.reverseTeam);
    }

    public void addPlayer(Person person){
        if(person.getAge()<40) {
            this.firstTeam.add(person);
        }else{
            this.reverseTeam.add(person);
        }
    }

}
