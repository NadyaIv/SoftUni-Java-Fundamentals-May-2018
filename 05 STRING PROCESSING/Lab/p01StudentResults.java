package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p01StudentResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputs=scanner.nextLine().split(" - ");
        String name=inputs[0];
        String[] input=inputs[1].split(", ");
        double[] results= Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();
        double average=(results[0]+results[1]+results[2])/3;
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|","Name","JAdv","JavaOOP","AdvOOP","Average"));
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",name,results[0],results[1],results[2],average));
    }
}
