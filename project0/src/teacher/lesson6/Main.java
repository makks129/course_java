package teacher.lesson6;

import collection.geometry.Circle;

public class Main {

    public static void main(String[] args) {

        System.out.println(Circle.getNumberOfCircles()); // 0

        Circle c1 = new Circle(10, 0, 0, Circle.COLOR_RED);

        System.out.println(Circle.getNumberOfCircles()); // 1

        Circle c2 = new Circle(10, 0, 0, Circle.COLOR_RED);

        System.out.println(Circle.getNumberOfCircles()); // 2

        Circle c3 = new Circle(10, 0, 0, Circle.COLOR_RED);

        System.out.println(Circle.getNumberOfCircles()); // 3






    }

}
