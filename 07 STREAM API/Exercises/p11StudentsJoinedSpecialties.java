package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class p11StudentsJoinedSpecialties {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> speciality = new ArrayList<>();
        //List<String[]> students = new ArrayList<>();
        List<String[]> result = new ArrayList<String[]>();
        while (true) {
            String input = reader.readLine();
            if ("Students:".equals(input)) {
                break;
            }
            String[] inputs = input.split("\\s+");
            speciality.add(inputs);
        }
        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) {
                break;
            }
            String[] inputs = input.split("\\s+");
            String name="";
            for (int i = 0; i <speciality.size() ; i++) {
                if(speciality.get(i)[2].equals(inputs[0])){
                    name=inputs[1]+" "+inputs[2]+" "+inputs[0]+" "+speciality.get(i)[0]+" "+speciality.get(i)[1];
                }
                if(!name.isEmpty()){
                    result.add(name.split(" "));
                }
                name="";

            }
        }
        List<String[]> sortedReasult=result.stream().sorted((a,b)->a[0].compareTo(b[0])).collect(Collectors.toList());
        for (String[] strings : sortedReasult) {
            String name=strings[0]+" "+strings[1]+" "+strings[2]+" "+strings[3]+" "+strings[4];
            System.out.println(name);
        }


    }
}
