package lesson10.test_errors;

import collection.geometry.Circle;
import collection.geometry.GeometricObject;
import collection.geometry.Rectangle;

public class TestErrors {

    public static void main(String[] args) {

        // Syntax (compilation) errors
//        int = 2;
//        i = 2;
//        int count;
//        while (count < 10)
//            count++;
//        }


        // Runtime errors
//        int x = 1 / 0;
//        int[] nums = new int[4];
//        System.out.println(nums[4]);
//        TestErrorsClassB testErrorsClassB = new TestErrorsClassB();
//        int intA = Integer.parseInt("a");
//        GeometricObject geometricObject = new Circle(10);
//        Rectangle rectangle = (Rectangle) geometricObject;


        // Logic errors (bugs)
        int a = 2;
        int b = 3;
        a += a + b;

    }

}
