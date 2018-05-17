package Lab;

import java.util.Locale;
import java.util.Scanner;

public class p10ExtractBitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int num=Integer.parseInt(scanner.next());
        int bits=Integer.parseInt(scanner.next());
        int nums=num>>bits;
        int bit =nums&1;
        System.out.println(bit);
    }
}
