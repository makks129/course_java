package lesson4;

/**
 * Create a method "sum" and use it to rewrite the code to eliminate duplication
 */
public class WriteMethodSum {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 10 is " + sum);


        sum = 0;
        for (int i = 20; i <= 30; i++) {
            sum += i;
        }
        System.out.println("Sum from 20 to 30 is " + sum);


        sum = 0;
        for (int i = 35; i <= 45; i++) {
            sum += i;
        }
        System.out.println("Sum from 35 to 45 is " + sum);

    }

}
