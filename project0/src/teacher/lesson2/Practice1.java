package lesson2;


import java.util.Scanner;

/**
 * FROM LESSON 1 HOMEWORK 3
 *
 * Computing the volume of a cylinder
 * Formula for area: area = radius * radius * Pi
 * Formula for volume: volume = area * length
 */
public class Practice1 {

    public static void main(String[] args) {

        // First write steps as comments here:
        // 1. Get radius and length from Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();

        // 2. Compute area
        double area = radius * radius * Math.PI;
        System.out.println("Area is " + area);

        // 3. Compute volume
        double volume = area * length;
        System.out.println("Volume is " + volume);


    }

}
