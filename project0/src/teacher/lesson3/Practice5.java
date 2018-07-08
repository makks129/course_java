package teacher.lesson3;

/**
 * Write a for loop with two control variables that both increment by 1 on each turn.
 * Loop until the sum of two variables is equal or greater than 100
 */
public class Practice5 {

    public static void main(String[] args) {

        int sum = 0;
        int j = 0;
        for (int i = 0; sum < 100; i++) {
            sum += i + j;
            j++;
        }
        System.out.println(sum);

    }

}
