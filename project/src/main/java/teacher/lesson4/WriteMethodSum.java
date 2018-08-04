package teacher.lesson4;

/**
 * Create a method "sum" and use it to rewrite the code to eliminate duplication
 */
public class WriteMethodSum {

    public static void main(String[] args) {

        printSum(1, 10);
        printSum(20, 30);
        printSum(35, 45);

    }

    public static void printSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " is " + sum);
    }


}
