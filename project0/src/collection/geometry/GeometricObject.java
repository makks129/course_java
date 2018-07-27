package collection.geometry;

public abstract class GeometricObject {

    protected Color color;
    protected long dateCreated;

    protected GeometricObject() {
        dateCreated = System.currentTimeMillis();
    }

    protected GeometricObject(Color color) {
        this();
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
