package Lab;

import java.util.Locale;
import java.util.Scanner;

public class p06TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double km=Double.parseDouble(scanner.nextLine());
        String timeDay=scanner.nextLine();
        double initialTax=0.70;
        double dayCostTaxi=0.79;
        double nightCostTaxi=0.90;
        double costBus=0.09;
        double costTrain=0.06;
        double km20=20;
        double km100=100;
        double tax=0;
        if(km<km20){
            if(timeDay.equals("day")){
                tax=initialTax+km*dayCostTaxi;
            }else{
                tax=initialTax+km*nightCostTaxi;
            }
        }else if(km<km100){
            tax=km*costBus;
        }else {
            tax=km*costTrain;
        }
        System.out.printf("%.2f",tax);
    }
}
