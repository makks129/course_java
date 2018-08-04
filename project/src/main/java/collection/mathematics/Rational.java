package collection.mathematics;

/**
 * Not optimized!
 */
public class Rational {

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator cannot be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational r) {
        int newNumerator = numerator * r.denominator + denominator * r.numerator;
        int newDenominator = denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational r) {
        int newNumerator = numerator * r.denominator - denominator * r.numerator;
        int newDenominator = denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational r) {
        int newNumerator = numerator * r.numerator;
        int newDenominator = denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational r) {
        int newNumerator = numerator * r.denominator;
        int newDenominator = denominator * r.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public double doubleValue() {
        return numerator / (double) denominator;
    }

    public String getPrintString() {
        return numerator + "/" + denominator;
    }

    public static Rational add(Rational r1, Rational r2) {
        return r1.add(r2);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        return r1.subtract(r2);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        return r1.multiply(r2);
    }

    public static Rational divide(Rational r1, Rational r2) {
        return r1.divide(r2);
    }

}
