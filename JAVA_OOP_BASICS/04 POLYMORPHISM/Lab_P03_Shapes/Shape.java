package Lab_P03_Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;


    protected void setPerimeter() {
      this.perimeter=this.getPerimeter();
    }

    protected void setArea() {
        this.calculateArea();
        this.area=getPerimeter();
    }

    public double getPerimeter() {
        this.calculatePerimeter();
        return this.perimeter;
    }

    protected double getArea() {
        return this.area;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();

}

