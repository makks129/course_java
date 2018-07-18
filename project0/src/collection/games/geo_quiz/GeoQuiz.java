package collection.games.geo_quiz;

public class GeoQuiz {

    private static final String[] ALL_COUNTRIES = new String[200]; // fill with countries
    private static final String[] ALL_CAPITALS = new String[200]; // fill with corresponding capitals
    private static final int NUMBER_OF_QUESTIONS = 10;

    private String[] countries;
    private String[] capitals;
    private int questionNumber;
    private boolean[] guesses;

    public GeoQuiz() {
        countries = new String[NUMBER_OF_QUESTIONS]; // get random countries from ALL_COUNTRIES
        capitals = new String[NUMBER_OF_QUESTIONS]; // get random capitals from ALL_CAPITALS
        questionNumber = 0;
        guesses = new boolean[NUMBER_OF_QUESTIONS];
    }

    public String askQuestion() {
        return countries[questionNumber];
    }

    public void makeGuess(String answer) {
        String correctAnswer = capitals[questionNumber];
        guesses[questionNumber] = answer.equals(correctAnswer);
        questionNumber++;
    }

    public boolean hasNextQuestion() {
        return questionNumber < NUMBER_OF_QUESTIONS;
    }

    public void printResults() {
        for (int i = 0; i < guesses.length; i++) {
            System.out.println(guesses[i]);
        }
    }


}
