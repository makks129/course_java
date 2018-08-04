package teacher.lesson6;

import collection.geometry.Circle;

public class Test {

    public static void main(String[] args) {

        // 1.

        Object o = null; // What is going to happen here?



        // 2.

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        o1 = o3;
        o2 = o1;
        o3 = o2;


        // 3.

        Circle c = new Circle(10);
        // How can I change circle radius?
        c.radius = 20;
        // How can I call circle method?
        c.getArea();


        new Circle(10);

        new Circle(10).print();

        double area = new Circle(10).getArea();


    }

}
