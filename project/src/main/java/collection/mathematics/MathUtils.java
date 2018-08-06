package collection.mathematics;

public class MathUtils {

    public static int random(int from, int to) {
        return from + (int) (Math.random() * to);
    }

    /**
     * Randomly generates boolean value with a percentage chance of being true.
     * @param trueValueChancePercent chance percent to give true value
     * @return random value
     */
    public static boolean randomBoolean(double trueValueChancePercent) {
       return random(0, 1) <= trueValueChancePercent;
    }

    public static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static int factorialTailRecursive(int n) {
        return factorialTailRecursiveAuxiliary(n, 1);
    }

    private static int factorialTailRecursiveAuxiliary(int n, int result) {
        if (n == 1) {
            return result;
        } else {
            return factorialTailRecursiveAuxiliary(n - 1, n * result);
        }
    }

    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
