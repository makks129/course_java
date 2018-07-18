package collection.games.geo_quiz;

import collection.mathematics.Rational;

import java.util.Scanner;

public class GeoQuizTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GeoQuiz game1 = new GeoQuiz();
        while (game1.hasNextQuestion()) {
            String country = game1.askQuestion();
            System.out.print("Capital of " + country + " is: ");
            String userGuess = scanner.next();
            game1.makeGuess(userGuess);
        }
        game1.printResults();

    }

}
