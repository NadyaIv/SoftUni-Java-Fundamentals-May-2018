package Exercises_P05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Citizen> citizen= new ArrayList<>();
        while(true){
            String[] input=reader.readLine().split(" ");
            if("End".equals(input[0])){
                break;
            }
            if(input.length==3){
                Citizen person= new Person(input[0],Integer.valueOf(input[1]),input[2]);
                citizen.add(person);
            }else if(input.length==2){
                Citizen person= new Robots(input[0],input[1]);
                citizen.add(person);
            }
        }
        String end=reader.readLine();
        for (Citizen id : citizen) {
            if(id.isId(end)){
                System.out.println(id.getId());
            }
        }
    }
}
