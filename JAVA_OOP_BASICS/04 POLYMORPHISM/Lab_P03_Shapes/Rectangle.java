package Lab_P03_Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super();
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.height+this.width);
    }

    @Override
    public double calculateArea() {
        return this.height*this.width;
    }
}
