package lesson2.homework;

/**
 * Give your answers on boolean expressions.
 * Check by running the program.
 */
public class Homework1 {

    public static void main(String[] args) {

        System.out.println("Part 1");

        int x = 1;
        System.out.println((true) && (3 > 4));      // =
        System.out.println(!(x > 0) && (x > 0));    // =
        System.out.println((x > 0) || (x < 0));     // =
        System.out.println((x != 0) || (x == 0));   // =
        System.out.println((x >= 0) || (x < 0));    // =
        System.out.println((x != 1) == !(x == 1));  // =

        System.out.println("Part 2");

        int a = 2;
        int b = 3;
        int c = 6;
        System.out.println(a < b && b < c);         // =
        System.out.println(a < b || b < c);         // =
        System.out.println(!(a < b));               // =
        System.out.println(a + b < c);              // =
        System.out.println(a + b < c);              // =

        System.out.println("Part 3");

        System.out.println(2 * 2 - 3 > 2 && 4 - 2 > 5);     // =
        System.out.println(2 * 2 - 3 > 2 || 4 - 2 > 5);     // =

    }

}
