package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p04AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> numbers= Arrays.stream(reader.readLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());
        Function<Double,Double> addVat= x->1.2*x;
        System.out.println("Prices with VAT:");
        for (Double number : numbers) {
            System.out.printf("%.2f\n",addVat.apply(number));
        }
    }
}
