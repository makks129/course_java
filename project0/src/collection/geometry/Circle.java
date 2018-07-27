package collection.geometry;

public class Circle extends GeometricObject implements Comparable<Circle>, Cloneable {

    public double radius;
    private double centerX;
    private double centerY;

    private static int numberOfCircles;

    private Circle() {
        numberOfCircles++;
    }

    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    public Circle(double radius, double centerX, double centerY) {
        this(radius);
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Circle(double radius, Color color) {
        super(color);
        numberOfCircles++;
        setRadius(radius);
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }


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
            throw new GeometricException("Radius cannot be < 0");
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle) obj;
            return radius == otherCircle.getRadius()
                    && color.equals(otherCircle.getColor())
                    && centerX == otherCircle.centerX
                    && centerY == otherCircle.centerY;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle of radius " + radius + ", color " + color + ", centerX " + centerX + ", centerY " + centerY;
    }

    @Override
    public int compareTo(Circle other) {
        if (radius > other.radius) {
            return 1;
        } else if (radius < other.radius) {
            return -1;
        } else {
            return 0;
        }
    }
}
