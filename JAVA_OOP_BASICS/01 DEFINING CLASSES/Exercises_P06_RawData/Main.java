package Exercises_P06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numInputs=Integer.parseInt(reader.readLine());
        List<Cars> cars= new ArrayList<>();
        for (int i = 0; i <numInputs ; i++) {
            String[] input = reader.readLine().split(" ");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            Engines engine= new Engines(engineSpeed,enginePower);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Cargos cargo= new Cargos(cargoWeight,cargoType);
            double tire1Pressure=Double.parseDouble(input[5]);
            int tire1Age=Integer.parseInt(input[6]);
            double tire2Pressure=Double.parseDouble(input[7]);
            int tire2Age=Integer.parseInt(input[8]);
            double tire3Pressure=Double.parseDouble(input[9]);
            int tire3Age=Integer.parseInt(input[10]);
            double tire4Pressure=Double.parseDouble(input[11]);
            int tire4Age=Integer.parseInt(input[12]);
            Tires tire= new Tires(tire1Pressure,tire1Age,tire2Pressure,tire2Age,tire3Pressure,tire3Age,tire4Pressure,tire4Age);
            Cars car= new Cars(model,engine,cargo,tire);
            cars.add(car);
        }

        String command=reader.readLine();
        if("fragile".equals(command)){
            cars.stream().filter(x->"fragile".equals(x.getCargo().getCargoType()) && (x.getTire().getTire1Pressure()<1 ||
                    x.getTire().getTire2Pressure()<1 ||
                    x.getTire().getTire3Pressure()<1 ||
                    x.getTire().getTire4Pressure()<1)).forEach(x-> System.out.println(x.getModel()));
        }else if("flamable".equals(command)){
            cars.stream().filter(x->"flamable".equals(x.getCargo().getCargoType()) && x.getEngine().getEnginePower()>250).
                    forEach(x-> System.out.println(x.getModel()));
        }
    }
}
