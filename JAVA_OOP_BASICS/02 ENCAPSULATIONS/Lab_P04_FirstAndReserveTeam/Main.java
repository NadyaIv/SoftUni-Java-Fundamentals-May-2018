package Lab_P04_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int countOfPerson=Integer.parseInt(reader.readLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i <countOfPerson ; i++) {
            String[] inputs= reader.readLine().split(" ");
            Person person=new Person(inputs[0], inputs[1], Integer.parseInt(inputs[2]), Double.parseDouble(inputs[3]));
            persons.add(person);
        }
Team team =new Team("me");
        for (Person person : persons) {
            team.addPlayer(person);
        }
        System.out.printf("First team have %d players\n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players",team.getReverseTeam().size());

    }
}
