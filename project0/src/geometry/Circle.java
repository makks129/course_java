package geometry;

public class Circle {

    public double radius;
    public double centerX;
    public double centerY;
    public String color;
    final public long dateCreated;

    public Circle() {
        dateCreated = System.currentTimeMillis();
    }

    public Circle(double radius) {
        this.radius = radius;
        dateCreated = System.currentTimeMillis();
    }

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        dateCreated = System.currentTimeMillis();
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Circle(double radius, double centerX, double centerY, String color) {
        this.radius = radius;
        dateCreated = System.currentTimeMillis();
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("radius = " + radius + ", color = " + color);
    }

}
