package Lab;

import java.util.Scanner;

public class p03ParseTags {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String inputs=scanner.nextLine();
        String startTag="<upcase>";
        String endTag="</upcase>";
        String replaced="";
        String element="";
        while(inputs.contains(endTag)){
            int stratIndex=inputs.indexOf(startTag);
            int endIndex=inputs.indexOf(endTag);
          replaced=inputs.substring(stratIndex,endIndex+endTag.length());
          element=inputs.substring(stratIndex+startTag.length(),endIndex);
          inputs=inputs.replace(replaced,element.toUpperCase());

        }
        System.out.println(inputs);
    }
}
