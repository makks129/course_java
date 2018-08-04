package lesson4;

/**
 * Write an overloaded max method
 */
public class WriteMethodMaxOverloaded {

    public static void main(String[] args) {

        System.out.println(max(1, 2));

        System.out.println(max(1.35, 2.87));

//        System.out.println(max(1.35, 4.96, 2.87));

    }

    public static int max(int i1, int i2) {
        if (i1 > i2) {
            return i1;
        } else {
            return i2;
        }
    }

    public static double max(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }

//    public static double max(double d1, double d2, double d3) {
    // ...
//    }

}
