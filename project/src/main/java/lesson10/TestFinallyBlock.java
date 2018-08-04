package lesson10;

public class TestFinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println("try: before method");
            method();
            System.out.println("try: after method");
        } catch (ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

    }

    public static void method() {
        // 1. No exception
        // 2. Catching exception
//        throw new ArithmeticException();
        // 3. Not catching exception
        throw new RuntimeException();
    }

}
