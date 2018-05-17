package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class p13BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        long amount=Long.parseLong(scanner.nextLine());
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        long[][] matrix=new long[rows][cols];
        scanner.nextLine();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=scanner.nextLong();
            }
        }
scanner.nextLine();
        int rowElement=scanner.nextInt();
        int colElement=scanner.nextInt();
scanner.nextLine();

            for (int row = rowElement - 1; row <= rowElement + 1; row++) {
                for (int col = colElement - 1; col <= colElement + 1; col++) {
                    try{
                        matrix[row][col] += amount;
                    }catch(Exception e){
                        continue;
                    }
                }
            }

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
