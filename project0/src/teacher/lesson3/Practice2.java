package teacher.lesson3;

/**
 * Write a loop that sums all integers until the sum is more or equal to 1000
 * Use sum as a continuation condition
 */
public class Practice2 {

    public static void main(String[] args) {

        // while
        int sum = 0;
        int i = 0;
        while (sum < 1000) {
            sum += i;
            i++;
        }
        System.out.println(sum);


        // for
        int sum2 = 0;
        for (int j = 0; sum2 < 1000; j++) {
            sum2 += j;
        }
        System.out.println(sum2);



    }

}
