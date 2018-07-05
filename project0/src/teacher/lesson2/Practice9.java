package lesson2;

/**
 * Even/odd number checker
 */
public class Practice9 {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10); // Math.random gives double from 0.0 to 0.9. Multiply by 10 and cast to int to get from 0 to 9

        // Write code to check for even/odd number
        boolean isEven = randomNumber % 2 == 0;
        if (isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
