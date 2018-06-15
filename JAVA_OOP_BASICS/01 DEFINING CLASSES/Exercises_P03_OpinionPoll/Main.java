package Exercises_P03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(reader.readLine());
        List<Person> persons=new ArrayList<>();
        for (int i = 0; i <num; i++) {
            String[] input=reader.readLine().split(" ");
            Person person = new Person(input[0],Integer.parseInt(input[1]));
            persons.add(person);
        }
        persons.stream().filter(x->x.getAge()>30).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(x->{
            System.out.printf("%s - %d\n",x.getName(),x.getAge());
        });
    }
}
