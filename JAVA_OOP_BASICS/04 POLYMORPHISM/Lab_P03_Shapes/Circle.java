package Lab_P03_Shapes;

public class Circle extends Shape {
private double radius;

    public Circle(double radius) {
        super();
       setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*this.radius*2;
    }

    @Override
    public double calculateArea() {
        return Math.PI*this.radius*this.radius;
    }

}
