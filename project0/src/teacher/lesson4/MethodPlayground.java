package teacher.lesson4;

/**
 * Playground
 */
public class MethodPlayground {

    public static void main(String[] args) {

        printSum(1, 2);

        int result = sum(1, 2) + sum(2, 3);


        if (isEven(4)) {
            // 4 is even
        } else {
            // 4 is odd
        }

        if (isEven(sum(sum(4234, 2234), 22342))) {
            // even
        }

    }



    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

}
