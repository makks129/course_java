package collection.geometry;

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



        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);

        int compareResult = c1.compareTo(c2);
        System.out.println(compareResult);


    }

//    public static void printArea(GeometricObject geometricObject) {
//        System.out.println(geometricObject.getArea());
//    }


}
