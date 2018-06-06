package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class p04SortStudentsByComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> students=new ArrayList<String[]>();
        while(true){
            String input=reader.readLine();
            if("END".equals(input)){
                break;
            }
            String[] inputs=input.split(" ");
            students.add(inputs);
        }
        Comparator<String[]> sortByFirstName=(x,y)-> y[0].compareTo(x[0]);
        Comparator<String[]> sortByLastName=(x,y)-> x[1].compareTo(y[1]);
        students.stream()
                .sorted(sortByLastName.thenComparing(sortByFirstName))
                .forEach(x-> System.out.printf("%s %s\n",x[0],x[1]));
    }
}
