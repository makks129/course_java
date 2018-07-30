package collection.games.geo_quiz;

import java.util.*;

public class GeoQuiz {

    private static final Map<String, String> allCapitalsAndCountries = new HashMap<>();

    private static final int NUMBER_OF_QUESTIONS = 10;

    private Delegate delegate;

    private Map<String, String> capitalsAndCountries;
    private int questionNumber;
    private List<Boolean> guesses;

    public GeoQuiz() {
        fillCountriesAndCapitals();

        capitalsAndCountries = new LinkedHashMap<>(NUMBER_OF_QUESTIONS);
        capitalsAndCountries.putAll(allCapitalsAndCountries); // todo add 10 random map entries

        questionNumber = 0;
        guesses = new ArrayList<>(NUMBER_OF_QUESTIONS);
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void start() {
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {

            // todo
//            String answer = delegate.askQuestion();


        }

//        delegate.onEnd();

    }

    public String askQuestion() {
        Collection<String> values = capitalsAndCountries.values();
        List<String> valueList = new ArrayList<>(values);
        String value = valueList.get(questionNumber);
        return value;
    }

    public void makeGuess(String answer) {
        String country = capitalsAndCountries.get(answer);

        // todo finish method
//        String correctAnswer = capitals[questionNumber];
//        guesses[questionNumber] = answer.equals(correctAnswer);
//        questionNumber++;
    }

    public boolean hasNextQuestion() {
        return questionNumber < NUMBER_OF_QUESTIONS;
    }

    public void printResults() {
//        for (int i = 0; i < guesses.length; i++) {
//            System.out.println(guesses[i]);
//        }
    }

    private void fillCountriesAndCapitals() {
        if (allCapitalsAndCountries.isEmpty()) {
            allCapitalsAndCountries.put("Moscow", "Russia");
            allCapitalsAndCountries.put("Paris", "France");
            allCapitalsAndCountries.put("Berlin", "Germany");
        }
    }

    public interface Delegate {
        String askQuestion(String country);
        void onEnd(String result);
    }

}
