package teacher.lesson5;

import collection.geometry.Circle;

public class TestReferences {

    public static void main(String[] args) {

        int x = 1;
        method1(x);
        System.out.println(x);

        Circle c1 = new Circle(10);
        printRadius(c1);
        System.out.println(c1.radius);

    }


    public static void method1(int x) {
        x++;
    }

    public static void printRadius(Circle circle) {
        System.out.println(circle.radius);
    }

}
