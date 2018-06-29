package Exercises_P04_ShoppingSpree;

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
        Map<String, Person> persons = new LinkedHashMap<>();
        String[] inputPersons = reader.readLine().split(";");
        for (int i = 0; i < inputPersons.length; i++) {
            String[] input = inputPersons[i].split("=");
            String name = input[0];
            double money = Double.parseDouble(input[1]);
            Person person=null;
            try {
                 person = new Person(name, money);
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
                return;
            }
            if(person!=null){
                persons.putIfAbsent(name, person);
            }


        }

        Map<String, Product> products = new LinkedHashMap<>();
        String[] inputProduct = reader.readLine().split(";");
        for (int i = 0; i < inputProduct.length; i++) {
            String[] input = inputProduct[i].split("=");
            String name = input[0];
            double money = Double.parseDouble(input[1]);
            Product product=null;
            try {
               product = new Product(name, money);
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
                return;
            }
            if(product!=null){
                products.putIfAbsent(name, product);
            }

        }
        while(true){
            String[] input=reader.readLine().split(" ");
            if("END".equals(input[0])){
                break;
            }
            String namePerson= input[0];
            String nameProduct=input[1];
            if(persons.containsKey(namePerson) && products.containsKey(nameProduct)) {
                try {
                    persons.get(namePerson).buyProduct(products.get(nameProduct));
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            }
        }
        /*for (Map.Entry<String,Person> entry : persons.entrySet()) {
            System.out.print(entry.getKey()+" - ");
            List<String> pr= new ArrayList<>();
            for (Product product : entry.getValue().getProducts()) {
                pr.add(product.getName());
            }
            if(!pr.isEmpty()){
                System.out.println(pr.toString().replaceAll("[\\[\\]]", ""));
            }else{
                System.out.println("Nothing bought");
            }

        };*/
        for (Map.Entry<String,Person> entry : persons.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
