package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p10X_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> bits = new ArrayList<String>();
        int lenght=0;
        for (int l = 0; l <8 ; l++) {
            int num1 = Integer.parseInt(scanner.next());
            String numOne = Integer.toBinaryString(num1);
            String empty = "";
            lenght = numOne.length();
            if (lenght <= 32) {
                for (int i = 0; i < 32 - lenght; i++) {
                    empty = empty + "0";
                }
                numOne = empty + numOne;
            }else {
                numOne=numOne.substring(numOne.length()-32);
            }
            bits.add(numOne);
        }
        int[][] matrix=new int[8][32];
            for (int j = 0; j <bits.size() ; j++) {
                String element=bits.get(j);
                for (int k = 0; k <element.length() ; k++) {
                    matrix[j][k]=element.charAt(k)-48;
                }
            }
        int count=0;
        for (int i = 0; i <matrix.length-2 ; i++) {
            for (int j = 0; j <matrix[i].length-2; j++) {
                if(matrix[i][j]==1 && matrix[i][j+1]==0 && matrix[i][j+2]==1 &&
                        matrix[i+1][j]==0 && matrix[i+1][j+1]==1 && matrix[i+1][j+2]==0 &&
                        matrix[i+2][j]==1 && matrix[i+2][j+1]==0 && matrix[i+2][j+2]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
