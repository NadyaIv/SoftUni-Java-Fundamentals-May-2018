package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class p07ExcellentStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Map<String,List<String>> students=new LinkedHashMap<>();
        while(true){
            String input=reader.readLine();
            if("END".equals(input)){
                break;
            }
            String[] inputs=input.split(" ");
            String firstName=inputs[0];
            String lastName=inputs[1];
            String name=firstName+" "+lastName;
            List<String> grades=new ArrayList<String>();
            for (int i = 2; i<inputs.length ; i++) {
                grades.add(inputs[i]);
            }
            students.putIfAbsent(name,grades);
        }
        students.entrySet().stream()
                .filter(x->x.getValue().contains("6"))
                .forEach(x-> System.out.printf("%s\n",x.getKey()));
    }
}
