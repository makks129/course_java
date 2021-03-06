package collection.geometry;

import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

//        GeometricObject o1 = new Circle(10, 0, 0);
//        GeometricObject o2 = new Rectangle(10, 10);
//
//        printArea(o1);
//        printArea(o2);




//        try {
////            Circle c1 = new Circle(-1, "red");
//            Circle c2 = new Circle(10, "blabla");
//        } catch (GeometricException e) {
//            e.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        System.out.println();


//
//        Circle c1 = new Circle(10);
//        Circle c2 = new Circle(20);
//
//        int compareResult = c1.compareTo(c2);
//        System.out.println(compareResult);

        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(10, 20);
        Rectangle r3 = new Rectangle(20, 10);
        Rectangle r4 = new Rectangle(20, 20);

        int comparableResult = r1.compareTo(r2);

        RectangleHeightComparator heightComparator = new RectangleHeightComparator();
        int comparatorResult = heightComparator.compare(r1, r2);

        System.out.println(comparableResult);
        System.out.println(comparatorResult);



        MyComparator widthComparator = new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Rectangle && o2 instanceof Rectangle) {
                    Rectangle r1 = (Rectangle) o1;
                    Rectangle r2 = (Rectangle) o2;
                    if (r1.getWidth() > r2.getWidth()) {
                        return 1;
                    } else if (r1.getWidth() < r2.getWidth()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                throw new RuntimeException("o1 or o2 are not Rectangle");
            }
        };

        widthComparator.compare(r1, r2);





    }

//    public static void printArea(GeometricObject geometricObject) {
//        System.out.println(geometricObject.getArea());
//    }


}
