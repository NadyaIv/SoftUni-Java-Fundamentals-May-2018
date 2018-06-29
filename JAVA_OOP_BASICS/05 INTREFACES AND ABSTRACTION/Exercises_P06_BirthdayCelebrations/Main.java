package Exercises_P06_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> citizen= new ArrayList<>();
        while(true){
            String[] input=reader.readLine().split(" ");
            if("End".equals(input[0])){
                break;
            }
            if(input[0].equals("Citizen")){
               Birthable person= new Person(input[1],Integer.valueOf(input[2]),input[3],input[4]);
                citizen.add(person);
            }else if(input[0].equals("Pet")){
                Birthable person= new Pets(input[1],input[2]);
                citizen.add(person);
            }
        }
        String end=reader.readLine();
                for (Birthable citiz : citizen) {
            if(citiz.isBirthday(end)){
                System.out.println(citiz.getBirthday());
            }
        }
    }
}
