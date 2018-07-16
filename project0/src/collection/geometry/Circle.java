package collection.geometry;

public class Circle {

    public static final String COLOR_RED = "red";
    public static final String COLOR_GREEN = "green";
    public static final String COLOR_BLUE = "blue";

    public double radius;
    private double centerX;
    private double centerY;
    private String color;
    private long dateCreated;

    private static int numberOfCircles;

    private Circle() {
        dateCreated = System.currentTimeMillis();
        numberOfCircles++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(double radius, double centerX, double centerY) {
        this(radius);
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Circle(double radius, double centerX, double centerY, String color) {
        this(radius, centerX, centerY);
        this.color = color;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

//    public double getArea() {
//        return radius * radius * Math.PI;
//    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("radius = " + radius + ", color = " + color);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("")) {
            return;
        }
        this.color = color;
    }

    public long getDateCreated() {
        return dateCreated;
    }


}
