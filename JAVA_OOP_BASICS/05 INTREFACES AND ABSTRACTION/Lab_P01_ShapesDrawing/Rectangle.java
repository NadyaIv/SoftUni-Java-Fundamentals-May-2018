package Lab_P01_ShapesDrawing;

public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
       setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        drawLine(this.width, '*', '*');
        for (int i = 1; i < this.height - 1; ++i)
            drawLine(this.width, '*', ' ');
        drawLine(this.width, '*', '*');

    }

    private void drawLine(int width, char end, char mid) {
            System.out.print(end);
            for (int i = 1; i < width - 1; ++i)
                System.out.print(mid);
            System.out.println(end);
        }
    }
