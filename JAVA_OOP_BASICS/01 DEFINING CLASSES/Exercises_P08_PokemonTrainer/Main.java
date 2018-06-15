package Exercises_P08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<Pokemon>> trainers = new LinkedHashMap<>();
        List<Trainer> trainerses = new ArrayList<>();
        List<String> elements = new ArrayList<>();
        elements.add("Fire");
        elements.add("Water");
        elements.add("Electricity");
        while (true) {
            String[] input = reader.readLine().split(" ");
            if ("Tournament".equals(input[0])) {
                break;
            }
            Pokemon pokemon = new Pokemon(input[1], input[2], Integer.parseInt(input[3]));
            trainers.putIfAbsent(input[0], new ArrayList<>());
            trainers.get(input[0]).add(pokemon);
        }
        for (Map.Entry<String,List<Pokemon>> entry : trainers.entrySet()) {
            Trainer trainer = new Trainer(entry.getKey(), 0, entry.getValue());
            trainerses.add(trainer);
        }
        boolean isHaveOneElement = false;
        while (true) {
            String[] inputs = reader.readLine().split(" ");
            if ("End".equals(inputs[0])) {
                break;
            }
            String element = inputs[0];
            for (Trainer trainer : trainerses) {
                for (int i = 0; i < trainer.getPokemons().size(); i++) {
                    String elem = trainer.getPokemons().get(i).getElement();
                    if (elem.equals(element)) {
                        isHaveOneElement = true;

                    }
                }
                if(isHaveOneElement){
                    trainer.setBadges(1);
                }else{
                    for (int i = 0; i < trainer.getPokemons().size(); i++) {
                         trainer.getPokemons().get(i).setHealth(10);
                         if(trainer.getPokemons().get(i).getHealth()<=0){
                             trainer.getPokemons().remove(i);
                             i++;
                         }
                    }
                }
                isHaveOneElement=false;
            }
        }
        trainerses.stream().sorted((a,b)->Integer.compare(b.getBadges(),a.getBadges())).forEach(x->{
            System.out.printf("%s %d %d\n",x.getName(),x.getBadges(),x.getPokemons().size());
        });
    }
}
