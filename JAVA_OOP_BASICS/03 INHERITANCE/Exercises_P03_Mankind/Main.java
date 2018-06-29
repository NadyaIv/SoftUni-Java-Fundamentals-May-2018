package Exercises_P03_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] student=reader.readLine().split(" ");
        String[] worker=reader.readLine().split(" ");
        Student students=null;
        Worker workers=null;
        try{
          students= new Student(student[0],student[1],student[2]);
          workers= new Worker(worker[0],worker[1],Double.parseDouble(worker[2]),Double.parseDouble(worker[3]));

        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        if(students!=null && worker!=null){
            System.out.println(students);
            System.out.println(workers);
        }

    }
}
