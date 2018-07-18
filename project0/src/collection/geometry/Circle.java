package collection.geometry;

public class Circle extends GeometricObject {

    public double radius;
    private double centerX;
    private double centerY;

    private static int numberOfCircles;

    private Circle() {
        numberOfCircles++;
        System.out.println("Constructor in Circle()");
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
        System.out.println("Constructor in Circle(double radius)");
    }

    public Circle(double radius, double centerX, double centerY) {
        this(radius);
        this.centerX = centerX;
        this.centerY = centerY;
        System.out.println("Constructor in Circle(double radius, double centerX, double centerY)");
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("radius = " + radius + " color = " + color);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

}
