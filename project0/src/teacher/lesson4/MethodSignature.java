package teacher.lesson4;

/**
 * Demonstrates signature of a method
 */
public class MethodSignature {


    // modifiers      // return type     // method name      // list of params
    public static void print(int x, int y, double a, String text) {

        // method body

    }

    public static void printTwice(String text) {
        System.out.println(text + text);
    }

    public static int getRandomNumber(int upperLimit) {
        int result = (int) (Math.random() * upperLimit);
        return result; // return statement
    }

}
