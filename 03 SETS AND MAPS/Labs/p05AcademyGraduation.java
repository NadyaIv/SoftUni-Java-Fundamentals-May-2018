package Labs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p05AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=Integer.valueOf(scanner.nextLine());
        Map<String,double[]> students=new TreeMap<>();
        for (int i = 0; i <num ; i++) {
            String name=scanner.nextLine();
            double[] grades= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            students.put(name,grades);
        }
        for (Map.Entry<String,double[]> student : students.entrySet()) {
         double sum=0;
            for (int i = 0; i <student.getValue().length ; i++) {
                sum+=student.getValue()[i];
            }
            double avg=sum*1.0/student.getValue().length;
            System.out.printf("%s is graduated with %s\n",student.getKey(),avg);
        }
    }
}
