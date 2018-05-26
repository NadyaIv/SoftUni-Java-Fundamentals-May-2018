package Labs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> carParking=new HashSet<>();
        while(true){
            String input=scanner.nextLine();
            if("END".equals(input)){
                break;
            }
            String[] lines=input.split(", ");
            if(lines[0].equals("IN")){
                carParking.add(lines[1]);
            }else if(lines[0].equals("OUT")){
                if(carParking.contains(lines[1])){
                    carParking.remove(lines[1]);
                }

            }

        }
        if(carParking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String s : carParking) {
                System.out.println(s);
            }
        }

    }
}
