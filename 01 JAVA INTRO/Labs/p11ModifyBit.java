package Lab;

import java.util.Locale;
import java.util.Scanner;

public class p11ModifyBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int n=Integer.parseInt(scanner.next());
        int p=Integer.parseInt(scanner.next());
        int v=Integer.parseInt(scanner.next());
        if(v==0){
            int mark = ~(1<<p);
            n=n&mark;
        }else{
           int mark=1<<p;
            n=n|mark;
        }
        System.out.println(n);
    }
}
