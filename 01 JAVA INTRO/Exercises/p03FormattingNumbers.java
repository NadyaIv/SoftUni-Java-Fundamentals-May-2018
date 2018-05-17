package Exercises;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.PI;

public class p03FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int a=Integer.parseInt(scanner.next());
        double b=Double.parseDouble(scanner.next());
        double c=Double.parseDouble(scanner.next());
        String hex=Integer.toHexString(a).toUpperCase();
        int num=10-hex.length();
        String emptya="";
        for (int i = 0; i <num ; i++) {
            emptya+=" ";
        }
        String binary=Integer.toBinaryString(a);
        BigDecimal bd = new BigDecimal(Double.toString(b));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        String emptyb="";
        String bds=bd.toString();
        int numb=10-bds.length();
        for (int i = 0; i <numb ; i++) {
            emptyb+=" ";
        }
        BigDecimal bdc = new BigDecimal(Double.toString(c));
        bdc = bdc.setScale(3, RoundingMode.HALF_UP);
        String emptybc="";
        String bdsc=bdc.toString();
        int numbc=10-bdsc.length();
        for (int i = 0; i <numbc ; i++) {
            emptybc+=" ";
        }
        String aBinary=binary.toString();
        int numBinary=10-aBinary.length();
        String numsBinary="";
        for (int i = 0; i <numBinary ; i++) {
            numsBinary+="0";
        }
        aBinary=numsBinary+aBinary;
        System.out.print("|"+hex+emptya);
        System.out.print("|"+aBinary+"|");
        System.out.printf("%s%.2f|",emptyb,bd);
        System.out.printf("%.3f%s|",bdc,emptybc);
        String doubles=String.format("%.2f",b);
        //System.out.println(doubles);
    }
}
