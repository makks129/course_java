package teacher.lesson2;

import java.util.Scanner;

/**
 * Determine leap year
 * Rules: leap year is divisible by 4 but not by 100 or divisible by 400
 */
public class Practice12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println("Year " + year + " is leap year");
        } else {
            System.out.println("Year " + year + " is NOT leap year");
        }

    }

}
