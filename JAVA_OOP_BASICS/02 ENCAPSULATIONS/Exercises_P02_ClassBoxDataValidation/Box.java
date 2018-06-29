package Exercises_P02_ClassBoxDataValidation;

public class Box {
    private double lenght;
    private double width;
    private double height;

    private void setLenght(double lenght) {
        if(lenght<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.lenght = lenght;
    }

    private void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public Box(double lenght, double width, double height) {
       setLenght(lenght);
        setWidth(width);
        setHeight(height);
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
