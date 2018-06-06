package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p06FilterStudentsPhone {
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
        students.stream()
                .filter(x->x[2].substring(0,"02".length()).equals("02") || x[2].substring(0,"+3592".length()).equals("+3592") )
                .forEach(x-> System.out.printf("%s %s\n",x[0],x[1]));
    }
}
