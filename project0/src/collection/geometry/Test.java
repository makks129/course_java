package collection.geometry;

public class Test {

    public static void main(String[] args) {

        GeometricObject o1 = new Circle(10, 0, 0);
        GeometricObject o2 = new Rectangle(10, 10);

        printArea(o1);
        printArea(o2);




        if (o1 instanceof Circle) {
            Circle c1 = (Circle) o1;
        }


    }

    public static void printArea(GeometricObject geometricObject) {
        System.out.println(geometricObject.getArea());
    }


}
