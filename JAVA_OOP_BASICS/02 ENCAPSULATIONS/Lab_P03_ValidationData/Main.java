package Lab_P03_ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfPerson= Integer.parseInt(reader.readLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i <countOfPerson ; i++) {
            String[] inputs=reader.readLine().split(" ");
            Person person=null;
            try {
                person = new Person(inputs[0], inputs[1], Integer.parseInt(inputs[2]), Double.parseDouble(inputs[3]));
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            if(person!=null){
                persons.add(person);
            }

        }
        double bonus=Double.parseDouble(reader.readLine());
        for (Person person : persons) {
            try {
                person.increaseSalary(bonus);
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            System.out.println(person);
        }
    }
}
