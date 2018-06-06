package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class p09StudentsEnrolled2014Or2015 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,List<String>> students=new LinkedHashMap<>();
        while(true){
            String input=reader.readLine();
            if("END".equals(input)){
                break;
            }
            String[] inputs=input.split(" ");
            String facultyNumber=inputs[0];
            List<String> grades=new ArrayList<String>();
            for (int i = 1; i<inputs.length ; i++) {
                grades.add(inputs[i]);
            }
            students.putIfAbsent(facultyNumber,grades);
        }
        students.entrySet().stream()
                .filter(x->isRolled(x.getKey()))
                .forEach(x-> printValues(x.getValue()));
    }

    private static void printValues(List<String> value) {
        for (String s : value) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    private static boolean isRolled(String key) {
        if(key.endsWith("14") || key.endsWith("15")){
            return true;
        }
        return false;
    }


}
