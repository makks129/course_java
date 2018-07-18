package collection.geometry;

public class Rectangle extends GeometricObject {

    private static int numberOfRectangles;

    private double height;
    private double width;

    private Rectangle() {
        numberOfRectangles++;
    }

    public Rectangle(double height, double width) {
        this();
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public static int getNumberOfRectangles() {
        return numberOfRectangles;
    }
}
