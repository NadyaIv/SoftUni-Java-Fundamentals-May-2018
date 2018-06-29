package Exercises_P01_ClassBox;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }
    public double surfaceArea(){
        return 2*(this.lenght*this.width+this.lenght*this.height+this.width*this.height);
    }
    public double lateralArea(){
        return 2*(this.lenght*this.height+this.width*this.height);
    }
    public double volume(){
        return (this.lenght*this.width*this.height);
    }
}
