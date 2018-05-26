package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p05Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,String> details=new LinkedHashMap<>();
        while(true){
            String input=scanner.nextLine();
            if("search".equals(input)){
                break;
            }
            String[] contacts=input.split("-");
            String name=contacts[0];
            String phone=contacts[1];
            details.put(name,phone);
        }
        while(true){
            String name=scanner.nextLine();
            if("stop".equals(name)){
                break;
            }

            if(details.containsKey(name)){
                System.out.printf("%s -> %s\n",name,details.get(name));
            }else{
                System.out.printf("Contact %s does not exist.\n",name);
            }
        }
    }
}
