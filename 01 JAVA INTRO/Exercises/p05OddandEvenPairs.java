package Exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class p05OddandEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int[] matrix= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(matrix.length%2!=0){
            System.out.println("invalid length");
        }else {
            for (int i = 0; i <matrix.length-1 ; i+=2) {
                if(matrix[i]%2==0 && matrix[i+1]%2==0){
                    System.out.printf("%d, %d -> both are even\n",matrix[i],matrix[i+1]);
                }else if(matrix[i]%2!=0 && matrix[i+1]%2!=0){
                    System.out.printf("%d, %d -> both are odd\n",matrix[i],matrix[i+1]);
                }else {
                    System.out.printf("%d, %d -> different\n",matrix[i],matrix[i+1]);
                }
            }
        }

    }
}
