package Lab;

import java.util.Scanner;

public class p02ParseURL {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] inputs=scanner.nextLine().split("://");
        if(inputs.length!=2){
            System.out.println("Invalid URL");
           return;
        }
        String protocol=inputs[0];
        int index=inputs[1].indexOf("/");
        String server=inputs[1].substring(0,index);
        String resources=inputs[1].substring(index+1);
        System.out.println(String.format("Protocol = %s",protocol));
        System.out.println(String.format("Server = %s",server));
        System.out.println(String.format("Resources = %s",resources));
    }
}
