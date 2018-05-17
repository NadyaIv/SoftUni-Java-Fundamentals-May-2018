package Exercises;

import com.sun.scenario.effect.impl.prism.ps.PPStoPSWDisplacementMapPeer;

import java.util.Scanner;

public class p06HitTheTarget {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int target=scanner.nextInt();
      int sum=0;
      int subtracted=0;
        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20 ; j++) {
                sum=i+j;
                if(sum==target){
                    System.out.printf("%d + %d = %d\n",i,j,target);
                }
            }
        }
        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20 ; j++) {
                subtracted=i-j;
                if(subtracted==target){
                    System.out.printf("%d - %d = %d\n",i,j,subtracted);
                }
            }
        }
    }
}
