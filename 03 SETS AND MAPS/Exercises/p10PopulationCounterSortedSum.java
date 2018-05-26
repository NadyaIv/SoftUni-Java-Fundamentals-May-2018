package Exercises;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p10PopulationCounterSortedSum {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
Map<String,Map<String,Long>> countries=new LinkedHashMap<>();
Map<String,Map<String,Long>> sortedCountries=new LinkedHashMap<>();
while(true){
    String input=scanner.nextLine();
    if("report".equals(input)){
        break;
    }
    Map<String,Long> cities=new LinkedHashMap<>();
    String[] details=input.split("\\|");
    String city=details[0];
    String country=details[1];
    long population=Long.parseLong(details[2]);
    if(!countries.containsKey(country)){
        cities.put(city,population);
        countries.put(country,cities);
    }else{
        cities=countries.get(country);
        cities.put(city,population);
        countries.put(country,cities);
    }

}
sortedCountries=countries.entrySet().stream().sorted((country1,country2) -> {
        long populationCountry1=country1.
                getValue().
                values().
                stream().
                mapToLong(Long::valueOf).sum();
    long populationCountry2=country2.getValue().
            values().stream().mapToLong(Long::valueOf).sum();
            int comparator=Long.compare(populationCountry2,populationCountry1);
        return comparator;}).
        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Map.Entry<String,Map<String,Long>> country : sortedCountries.entrySet()) {
String cityResult="";
long population=0;
           Map<String, Long> sortedCities = country.getValue().entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            for (Map.Entry<String, Long> city : sortedCities.entrySet()) {
                cityResult+="=>"+city.getKey()+": "+city.getValue()+"\n";
                population+=city.getValue();
            }
            System.out.printf("%s (total population: %d)\n",country.getKey(),population);
            System.out.print(cityResult);

        }
    }
}

