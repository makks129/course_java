package lesson4;

/**
 * Demonstrates signature of a method
 */
public class MethodSignature {


    // modifiers      // return type     // method name      // list of params
    public static     void               print               (int x, int y)      {

        // method body

    }

    public static void printTwice(String text) {
        System.out.println(text + text);
    }

    public static int getRandomNumber() {
        int result = (int) (Math.random() * 100);
        return result; // return statement
    }

}
