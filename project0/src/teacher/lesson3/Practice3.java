package teacher.lesson3;

/**
 * 1. Write an infinite loop that terminates when random number 0-99 is equal to 42
 * 2. Rewrite the code, so that random number is used as a continuation condition
 */
public class Practice3 {

    public static void main(String[] args) {

        int randomNumber = 0;
        while (randomNumber != 42) {
            randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);
        }





    }

}
