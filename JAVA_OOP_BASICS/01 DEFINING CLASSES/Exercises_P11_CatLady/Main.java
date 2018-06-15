package Exercises_P11_CatLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Cats> cats = new LinkedHashMap<>();
        while(true){
            String[] inputs=reader.readLine().split(" ");
            if("End".equals(inputs[0])){
                break;
            }
            String breed=inputs[0];
            String name=inputs[1];
           double detail=Double.parseDouble(inputs[2]);
           Cats cat= new Cats(name,breed,detail);
           cats.putIfAbsent(name,cat);
        }
        String name=reader.readLine();
        System.out.println(cats.get(name).toString());

    }
}
