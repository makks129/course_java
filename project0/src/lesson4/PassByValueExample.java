package lesson4;

public class PassByValueExample {

    public static void main(String[] args) {

        int x = 1;
        increment(x);
        System.out.println(x);


        int y = 2;
        multiply(y);
        System.out.println(y);


    }

    public static void increment(int x) {
        x++;
    }

    public static int multiply(int y) {
        y = y * 10;
        return y;
    }

}
