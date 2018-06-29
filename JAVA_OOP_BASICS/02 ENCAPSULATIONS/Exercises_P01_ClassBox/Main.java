package Exercises_P01_ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double l = Double.parseDouble(reader.readLine());
        double w = Double.parseDouble(reader.readLine());
        double h = Double.parseDouble(reader.readLine());
        Box box=new Box(l,w,h);
        System.out.printf("Surface Area - %.2f\n",box.surfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n",box.lateralArea());
        System.out.printf("Volume - %.2f",box.volume());
    }
}
