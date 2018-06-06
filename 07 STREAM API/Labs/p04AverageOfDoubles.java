package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class p04AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OptionalDouble doubleAverage=Arrays.asList(reader.readLine().split(" ")).stream()
        .filter(x->!x.isEmpty()).mapToDouble(Double::parseDouble)
        .average();
        if(doubleAverage.isPresent()){
            System.out.printf("%.2f",doubleAverage.getAsDouble());
        }else {
            System.out.println("No match");
        }
    }
}
