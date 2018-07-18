package collection.geometry;

public class GeometricObject {

    public static final String COLOR_RED = "red";
    public static final String COLOR_GREEN = "green";
    public static final String COLOR_BLUE = "blue";

    protected String color;
    protected long dateCreated;

    public GeometricObject() {
        dateCreated = System.currentTimeMillis();
        System.out.println("Constructor in GeometricObject()");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

}
