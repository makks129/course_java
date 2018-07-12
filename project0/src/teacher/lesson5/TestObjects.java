package teacher.lesson5;

import geometry.Circle;

import java.util.Date;

public class TestObjects {

    public static void main(String[] args) {


        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(10, 0, 0);
        Circle circle4 = new Circle(10, 0, 0, "red");


        circle1.radius = 5;
        circle1.centerX = 0;
        circle1.centerY = 0;
        circle1.color = "blue";

        System.out.println(circle1.radius);

        double area = circle1.getArea();
        double perimeter = circle1.getPerimeter();

        circle1.print();



        TV tv1 = new TV("Sony", 40);
        tv1.turnOn();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeUp();
        tv1.turnOff();
        System.out.println(tv1.isOn());



        new Circle(10);
        double area2 = new Circle(10).getArea();






    }

}
