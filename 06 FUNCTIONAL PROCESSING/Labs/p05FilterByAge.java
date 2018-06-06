package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class p05FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> persons = new LinkedHashMap<>();
        int num = Integer.valueOf(reader.readLine());
        for (int i = 0; i < num; i++) {
            String[] inputs = reader.readLine().split(", ");
            String name = inputs[0];
            int age = Integer.valueOf(inputs[1]);
            persons.putIfAbsent(name, age);
        }
        System.out.println();
        /*String condition=reader.readLine();
        String age=reader.readLine();
        String format=reader.readLine();*/
        String[] conditions = new String[3];
        for (int i = 0; i < conditions.length; i++) {
            conditions[i] = reader.readLine();
        }

        BiConsumer<Map<String, Integer>, String[]> names = (x, y) -> {
            int age = Integer.valueOf(y[1]);
            String format = y[2];
            for (Map.Entry<String, Integer> entry : x.entrySet()) {
                if (y[0].equals("younger")) {
                    if (entry.getValue() < age) {
                        if (format.equals("name")) {
                            System.out.println(entry.getKey());
                        } else if (format.equals("age")) {
                            System.out.println(entry.getValue());
                        } else if (format.equals("name age")) {

                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                } else if (y[0].equals("older")) {
                    if (entry.getValue() >= age) {
                        if (format.equals("name")) {
                            System.out.println(entry.getKey());
                        } else if (format.equals("age")) {
                            System.out.println(entry.getValue());
                        } else if (format.equals("name age")) {

                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                }
            }
        };
        names.accept(persons,conditions);
    }
}
