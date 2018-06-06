package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p11PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
        BiPredicate<String,String> starts= (x,y)-> {
            if (!x.startsWith(y)) {
return false;
            }
            return true;
        };
        BiPredicate<String,String> ends= (x,y)-> {
            if (!x.endsWith(y)) {
                return false;
            }
            return true;
        };
        BiPredicate<String,String> length= (x,y)-> {
            if (x.length()!=Integer.valueOf(y)) {
                return false;
            }
            return true;
        };
        while(true){
            String input=reader.readLine();
            if("Party!".equals(input)){
                break;
            }
            String[] inputs=input.split(" ");
            String command=inputs[0];
            String criteria=inputs[1];
            String element=inputs[2];
            if(command.equals("Remove")){
                if(criteria.equals("StartsWith")){
                    int lenght=strings.size();
                    for (int i = 0; i <strings.size(); i++) {
                        if(starts.test(strings.get(i),element)){
                            strings.remove(i);
                            i--;
                        }
                    }

                    }else if(criteria.equals("EndsWith")){
                    int lenght=strings.size();
                    for (int i = 0; i <strings.size(); i++) {
                        if(ends.test(strings.get(i),element)){
                            strings.remove(i);
                            i--;
                        }
                    }
                }else if(criteria.equals("Length")){
                    int lenght=strings.size();
                    for (int i = 0; i <strings.size(); i++) {
                        if(length.test(strings.get(i),element)){
                            strings.remove(i);
                            i--;
                        }
                    }
                }
            }else if(command.equals("Double")){
                if(criteria.equals("StartsWith")){
                    int lenght=strings.size();
                    for (int i = 0; i <strings.size(); i++) {
                        if(starts.test(strings.get(i),element)){
                            strings.add(i,strings.get(i));
                            i++;
                        }
                    }

                }else if(criteria.equals("EndsWith")){
                    int lenght=strings.size();
                    for (int i = 0; i <strings.size(); i++) {
                        if(ends.test(strings.get(i),element)){
                            strings.add(i,strings.get(i));
                            i++;
                        }
                    }
                }else if(criteria.equals("Length")){
                    int lenght=strings.size();
                    for (int i = 0; i <strings.size(); i++) {
                        if(length.test(strings.get(i),element)){
                            strings.add(i,strings.get(i));
                            i++;
                        }
                    }
                }
            }

        }
        if(strings.size()==0){
            System.out.printf("Nobody is going to the party!");
        }else {
            System.out.printf(strings.toString().replaceAll("[\\[\\]]",""));
            System.out.println(" are going to the party!");
        }
    }
}
