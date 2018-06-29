package Lab_P01_SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfPerson=Integer.valueOf(reader.readLine());
        List<Person> persons=new ArrayList<>();
        for (int i = 0; i <countOfPerson ; i++) {
            String[] inputs=reader.readLine().split(" ");
            Person person= new Person(inputs[0],inputs[1],Integer.valueOf(inputs[2]));
            persons.add(person);
        }
        persons.sort((a,b)->{
            int comp=a.getFirstName().compareTo(b.getFirstName());
            if(comp==0){
                return Integer.compare(a.getAge(),b.getAge());
            }
            return comp;
        });
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
