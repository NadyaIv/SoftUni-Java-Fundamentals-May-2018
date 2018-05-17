package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p09ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers=new ArrayList<Integer>();
        int number=scanner.nextByte();

        for (byte i = 0; i <number ; i++) {
            int num=Integer.parseInt(scanner.next());
            numbers.add(num);

        }
        scanner.nextLine();
        String commands=scanner.nextLine();
        while(!commands.equals("party over")){
            List<String> lines= Arrays.asList(commands.split(" "));
            byte command=Byte.parseByte(lines.get(0));
            byte position=Byte.parseByte(lines.get(1));

            if(command==-1){
                for (int i = 0; i <numbers.size() ; i++) {
                    int a=numbers.get(i);
                    int b=a>>position;
                    int c=b&1;
                    if(c==0){
                        int d=1<<position;
                        int result=a|d;
                        numbers.set(i,result);
                    }else{
                        int d=~(1<<position);
                        int result=a&d;
                        numbers.set(i,result);
                    }
                }
            }else if(command==1){
                for (int i = 0; i <numbers.size() ; i++) {
                    int a=numbers.get(i);
                    int b=a>>position;
                    int c=b&1;
                    int d=1<<position;
                    int result=a|d;
                    numbers.set(i,result);
                    }
            }else if(command==0) {
                for (int i = 0; i <numbers.size() ; i++) {
                   int a=numbers.get(i);
                    int b=a>>position;
                    int c=b&1;
                    int d=~(1<<position);
                    int result=a&d;
                    numbers.set(i,result);
                }
            }

            commands=scanner.nextLine();
        }
        for (Integer result : numbers) {
            System.out.println(result);
        }
    }
}
