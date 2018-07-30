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

}
