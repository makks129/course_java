package lesson4;

/**
 * An example to demonstrate how method stack works
 */
public class MethodStack {

    public static void main(String[] args) {

        method1();
        int result = method2();
        System.out.println("Result: " + result);

    }

    public static void method1() {
        method2();
    }

    private static int method2() {
        return method3(method4(method5()));
    }

    private static int method3(String param) {
        return param.length();
    }

    private static String method4(boolean param) {
        if (param) {
            return "Hi";
        } else {
            return "Goodbye";
        }
    }

    private static boolean method5() {
        int randomNumber = (int) (Math.random() * 2);
        if (randomNumber % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }


}
