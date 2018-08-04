package lesson7;

import collection.games.geo_quiz.GeoQuizV1;
import collection.games.geo_quiz.GeoQuizV2;
import collection.mathematics.Rational;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        // Testing Rationals

        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(2, 3);
        Rational r3 = r1.add(r2);
        System.out.println(r3.getPrintString());


        // Testing GeoQuizV1

        Scanner scanner = new Scanner(System.in);
        GeoQuizV1 game1 = new GeoQuizV1();
        while (game1.hasNextQuestion()) {
            String country = game1.askQuestion();
            System.out.print("Capital of " + country + " is: ");
            String userGuess = scanner.next();
            game1.makeGuess(userGuess);
        }
        game1.printResults();









    }

}
