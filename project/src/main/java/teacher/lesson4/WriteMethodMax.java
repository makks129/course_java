package teacher.lesson4;

/**
 * Write a method "max" that takes 2 integers and returns the biggest one
 */
public class WriteMethodMax {

    public static void main(String[] args) {

        int x = getRandomNumber(100000);
        int y = getRandomNumber(100000);
        System.out.println("x is " + x + ", y is " + y);

        System.out.println(max(x, y));

    }

    public static int getRandomNumber(int upperLimit) {
        return (int)(Math.random() * upperLimit);
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }



}
