package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class p08GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] matrix= Arrays.asList(scanner.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        String[] input=scanner.nextLine().split(" ");
        int num=Integer.parseInt(input[1]);
        String oddOrEven=input[2];
        int count=0;
        for (int i = 0; i <matrix.length ; i++) {
            if(oddOrEven.equals("odd") && count<num){
                if(matrix[i]%2!=0){
                    System.out.print(matrix[i]+ " ");
                    count++;
                }
            }
            if(oddOrEven.equals("even") && count<num){
                if(matrix[i]%2==0){
                    System.out.print(matrix[i]+ " ");
                    count++;
                }
            }

        }
    }
}
