package Exercises;

import java.util.*;

public class p07FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,String> result=new LinkedHashMap<>();
        List<String> ex=new ArrayList<String>();
        ex.add("us");
        ex.add("uk");
        ex.add("com");

        while(true){
            String name=scanner.nextLine();
            if("stop".equals(name)){
                break;
            }
            String email=scanner.nextLine();
            int index=email.indexOf(".");
            String extension=email.substring(index+1);
           if(!ex.contains(extension)){
              result.put(name,email);
           }
        }
        for ( String s : result.keySet()) {
            System.out.printf("%s -> %s\n",s,result.get(s));
        }
    }
}
