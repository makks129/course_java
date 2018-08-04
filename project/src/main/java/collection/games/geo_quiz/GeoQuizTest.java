package collection.games.geo_quiz;

import collection.io.SmartScanner;

public class GeoQuizTest {

    public static void main(String[] args) {

        SmartScanner scanner = new SmartScanner();
//        testGeoQuizV1(scanner);
        testGeoQuizV2(scanner);

    }

    private static void testGeoQuizV1(SmartScanner scanner) {
        GeoQuizV1 geoQuizV1 = new GeoQuizV1();
        while (geoQuizV1.hasNextQuestion()) {
            String country = geoQuizV1.askQuestion();
            String userGuess = scanner.requestLine("Capital of " + country + " is: ");
            geoQuizV1.makeGuess(userGuess);
        }
        geoQuizV1.printResults();
    }

    private static void testGeoQuizV2(SmartScanner scanner) {
        GeoQuizV2 geoQuizV2 = new GeoQuizV2(3);
        geoQuizV2.setDelegate(new GeoQuizV2.Delegate() {
            @Override
            public String askQuestion(String country) {
                return scanner.requestLine("What is the capital of " + country + "?");
            }

            @Override
            public void onEnd(int numberOfQuestions, int numberOfCorrectGuesses) {
                System.out.println("Game over! You correctly guessed " + numberOfCorrectGuesses + " capitals out of " + numberOfQuestions);
            }
        });
        geoQuizV2.start();
    }

}
