package Lab;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class p08ProductNumbersN_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int firstNumber=Integer.parseInt(scanner.next());
        int secondNumber=Integer.parseInt(scanner.next());
        BigInteger product=new BigInteger("1");
        for (int i = firstNumber; i <=secondNumber ; i++) {
           BigInteger number=new BigInteger(""+i);
           product= product.multiply(number);
        }
        System.out.printf("product[%d..%d] = %d",firstNumber,secondNumber,product);
    }
}
