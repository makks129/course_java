package teacher.lesson3;

import java.util.Arrays;

/**
 * 1. Create an array, initialise it with values and iterate through it with a loop
 * 2. Through a loop fill that array with random numbers
 * 3. Through a loop print all the values of that array
 * 4. Through a loop sum all the numbers of that array
 * 5. Through a loop find the biggest element of that array
 */
public class Practice10 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println("Sum = " + sum);


        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
        }
        System.out.println("Max = " + max);




        // System.out.println(Arrays.toString(nums));

    }

}
