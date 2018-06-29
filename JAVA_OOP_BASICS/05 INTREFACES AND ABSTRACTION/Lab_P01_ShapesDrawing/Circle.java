package Lab_P01_ShapesDrawing;

public class Circle implements Drawable{
    private int Ox;
    private int Oy;
    private int radius;

    public Circle(int ox, int oy, int radius) {
       setOx(ox);
        setOy(oy);
        setRadius(radius);
    }

    public void setOx(int ox) {
        Ox = ox;
    }

    public void setOy(int oy) {
        Oy = oy;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        double r_in = this.radius - 0.4;
        double r_out = this.radius + 0.4;
        for (double y = this.radius; y >= -this.radius; --y) {
            for (double x = -this.radius; x < r_out; x += 0.5) {
                double value = x * x + y * y;
                if (value >= r_in * r_in && value <= r_out * r_out) {
                    System.out.print("*");
                } else
                    System.out.print(" "); }
            System.out.println(); }

    }
}
