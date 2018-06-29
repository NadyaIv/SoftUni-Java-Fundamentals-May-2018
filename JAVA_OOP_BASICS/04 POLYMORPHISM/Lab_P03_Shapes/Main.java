package Lab_P03_Shapes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Circle circle1= new Circle(3);
        Rectangle circle2= new Rectangle(3,4);
        ArrayList<Shape> circle=new ArrayList<>();
        circle.add(circle1);
        circle.add(circle2);
        for (Shape shape : circle) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }
}
