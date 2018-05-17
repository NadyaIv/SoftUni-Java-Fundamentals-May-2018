package Exercises;

import java.util.*;

public class p12VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        List<String> vehicles =  new ArrayList<String>(Arrays.asList(scanner.nextLine().split(" ")));
        int initialSize=vehicles.size();
        String input=scanner.nextLine();
        while(!input.equals("End of customers!")){
            String[] lines=input.split(" ");
            String name=lines[0];
            String seats=lines[2];
            char firstLetter=name.toLowerCase().charAt(0);
            String newName=firstLetter+seats;
            if (vehicles.contains(newName)) {
                int price=(newName.charAt(0))*Integer.parseInt(seats);
                System.out.printf("Yes, sold for %d$\n",price);
                int ind=vehicles.indexOf(newName);
                //System.out.println(index);
                vehicles.remove(ind);
            }else {
                System.out.println("No");
            }

            input=scanner.nextLine();
        }
        System.out.print("Vehicles left: ");
        for (int i = 0; i <vehicles.size() ; i++) {
            if(i==vehicles.size()-1){
                System.out.print(vehicles.get(i));
            }else{
                System.out.print(vehicles.get(i)+", ");
            }
        }
        System.out.println();
        System.out.printf("Vehicles sold: %d",initialSize-vehicles.size());
    }
}
