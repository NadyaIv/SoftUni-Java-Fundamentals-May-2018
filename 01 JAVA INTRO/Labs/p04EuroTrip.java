package Lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class p04EuroTrip {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double quantity=Double.parseDouble(scanner.nextLine());
        double pricePerKg=1.20;
        BigDecimal quantities=new BigDecimal(quantity*pricePerKg);
        BigDecimal mark =new BigDecimal("4210500000000");
        BigDecimal Bg=mark.multiply(quantities);
        System.out.printf("%.2f marks",Bg);
    }
}
