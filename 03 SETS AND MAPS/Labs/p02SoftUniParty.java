package Labs;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> vip=new TreeSet<>();
        Set<String> regular=new TreeSet<>();
        while(true){
            String input=scanner.nextLine();
            if("PARTY".equals(input)){
                break;
            }
            if(Character.isDigit(input.charAt(0)) && input.length()==8){
                vip.add(input);
            }else if(Character.isLetter(input.charAt(0)) && input.length()==8){
                regular.add(input);
            }
        }
        while(true){
            String input=scanner.nextLine();
            if("END".equals(input)){
                break;
            }
            if(Character.isDigit(input.charAt(0)) && input.length()==8){
                vip.remove(input);
            }else if(Character.isLetter(input.charAt(0)) && input.length()==8){
                regular.remove(input);
            }
        }
        int size=vip.size()+regular.size();
        System.out.println(size);
        for (String s : vip) {
            System.out.println(s);
        }
        for (String s : regular) {
            System.out.println(s);
        }
    }
}
