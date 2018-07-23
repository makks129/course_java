package lesson10;

public class TestStackOverflowError {

    public static void main(String[] args) {

        method(0);

    }

    public static void method(int i) {
        System.out.println("method call index: " + i);
        method(++i);
    }

}
