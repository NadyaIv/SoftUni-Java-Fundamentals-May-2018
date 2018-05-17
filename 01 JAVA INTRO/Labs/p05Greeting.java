package Lab;

import java.util.Locale;
import java.util.Scanner;

public class p05Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String firstName=scanner.nextLine();
        String secondName=scanner.nextLine();
        if(firstName.isEmpty()){
            firstName="*****";
        }
        if(secondName.isEmpty()){
            secondName="*****";
        }
        System.out.printf("Hello, %s %s!",firstName,secondName);
    }
}
