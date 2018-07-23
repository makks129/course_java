package collection.geometry;

public class GeometricObject {

    public static final String COLOR_RED = "red";
    public static final String COLOR_GREEN = "green";
    public static final String COLOR_BLUE = "blue";

    protected String color;
    protected long dateCreated;

    protected GeometricObject() {
        dateCreated = System.currentTimeMillis();
    }

    protected GeometricObject(String color) {
        this();
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.equals(COLOR_RED)
                && !color.equals(COLOR_GREEN)
                && !color.equals(COLOR_BLUE)) {
            throw new IllegalArgumentException("Color " + color + " is invalid.");
        }
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
