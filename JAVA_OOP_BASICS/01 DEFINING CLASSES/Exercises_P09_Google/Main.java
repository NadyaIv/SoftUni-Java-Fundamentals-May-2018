package Exercises_P09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Person> persons= new LinkedHashMap<>();
        while(true){
            String[] inputs= reader.readLine().split(" ");
            if("End".equals(inputs[0])){
                break;
            }
            String personName=inputs[0];
            persons.putIfAbsent(personName,new Person());
            persons.get(personName).setName(personName);
            switch(inputs[1]){
                case "company":
                    Company company= new Company(inputs[2],inputs[3],Double.parseDouble(inputs[4]));
                    persons.get(personName).setCompany(company);
                    break;
                case"car":
                    Car car= new Car(inputs[2],Integer.parseInt(inputs[3]));
                    persons.get(personName).setCar(car);
                    break;
                case "pokemon":
                    Pokemon pokemon= new Pokemon(inputs[2],inputs[3]);

                    if(  persons.get(personName).getPokemon()==null){
                        List<Pokemon> pokemons= new ArrayList<>();
                        pokemons.add(pokemon);
                        persons.get(personName).setPokemon(pokemons);
                    }else{
                        persons.get(personName).getPokemon().add(pokemon);
                    }
                    break;
                case "children":
                    Children children= new Children(inputs[2],inputs[3]);
                    if(  persons.get(personName).getChildren()==null){
                        List<Children> childrens= new ArrayList<>();
                       childrens.add(children);
                        persons.get(personName).setChildren(childrens);
                    }else{
                        persons.get(personName).getChildren().add(children);
                    }
                    break;
                case"parents":
                    Parents parents= new Parents(inputs[2],inputs[3]);
                    if(  persons.get(personName).getParents()==null){
                        List<Parents> parentss= new ArrayList<>();
                        parentss.add(parents);
                        persons.get(personName).setParents(parentss);
                    }else{
                        persons.get(personName).getParents().add(parents);
                    }
                    break;
            };
        }
        String name=reader.readLine();
        System.out.println(persons.get(name).toString());
    }
}
