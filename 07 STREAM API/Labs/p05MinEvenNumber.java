package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class p05MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       /* OptionalDouble doubleAverage= Arrays.asList(reader.readLine().split(" ")).stream()
                .filter(x->!x.isEmpty()).mapToDouble(Double::parseDouble)
                .filter(x->x%2==0)
                .min();*/
        Optional<Double> doubleAverage= Arrays.stream(reader.readLine().split(" "))
                .filter(x->!x.isEmpty()).map(Double::parseDouble).filter(x->x%2==0).sorted((a,b)->Double.compare(a,b))
                .findFirst();
        if(doubleAverage.isPresent()){
            System.out.printf("%.2f",doubleAverage.get());
        }else {
            System.out.println("No match");
        }
    }
}
