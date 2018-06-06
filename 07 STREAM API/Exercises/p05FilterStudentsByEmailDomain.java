package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p05FilterStudentsByEmailDomain {
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
                .filter(x->x[2].substring(x[2].length()-"@gmail.com".length()).equals("@gmail.com"))
                .forEach(x-> System.out.printf("%s %s\n",x[0],x[1]));
    }
}
