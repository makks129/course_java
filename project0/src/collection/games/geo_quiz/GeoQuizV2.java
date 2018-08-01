package collection.games.geo_quiz;

import java.util.*;

/**
 * Improvements to GeoQuizV1:
 * 1. Uses Maps and Lists to store the data, instead of arrays
 * 2. Player can specify number of questions
 * 3. Using Observer Pattern to interact with the game
 * 4. The game automatically restarts when it ends
 */
public class GeoQuizV2 {

    private static final Map<String, String> allCapitalsAndCountries = new HashMap<>();

    private static final int DEFAULT_NUMBER_OF_QUESTIONS = 10;

    private Delegate delegate;

    private final int NUMBER_OF_QUESTIONS;
    private Map<String, String> capitalsAndCountries;
    private List<Boolean> guesses;

    public GeoQuizV2() {
        fillCountriesAndCapitals();
        NUMBER_OF_QUESTIONS = DEFAULT_NUMBER_OF_QUESTIONS;
        prepare();
    }

    public GeoQuizV2(int numberOfQuestions) {
        fillCountriesAndCapitals();
        NUMBER_OF_QUESTIONS = numberOfQuestions;
        prepare();
    }

    private void prepare() {
        capitalsAndCountries = new LinkedHashMap<>();
        fillGameQuestions();
        guesses = new ArrayList<>();
    }

    private void fillGameQuestions() {
        // capitals are not in completely random order in this set (most of the time the order is similar)
        Set<String> allCapitals = allCapitalsAndCountries.keySet();
        // so I put them into the list
        List<String> allCapitalsList = new ArrayList<>(allCapitals);
        // and shuffle the list
        Collections.shuffle(allCapitalsList);
        for (int i = 0; i < NUMBER_OF_QUESTIONS && i < allCapitalsList.size(); i++) {
            String capital = allCapitalsList.get(i);
            capitalsAndCountries.put(capital, allCapitalsAndCountries.get(capital));
        }
    }

    public void start() {
        Iterator<String> capitalsIter = capitalsAndCountries.keySet().iterator();
        for (int i = 0; i < capitalsAndCountries.size(); i++) {
            String capital = capitalsIter.next();
            String country = capitalsAndCountries.get(capital);
            String userCapital = delegate.askQuestion(country);

            boolean correctGuess = userCapital.equalsIgnoreCase(capital);
            guesses.add(correctGuess);
        }
        int correctGuesses = 0;
        for (Boolean guess : guesses) {
            if (guess) {
                correctGuesses++;
            }
        }
        delegate.onEnd(capitalsAndCountries.size(), correctGuesses);
        // restart in case of next game
        prepare();
    }

    private void fillCountriesAndCapitals() {
        if (allCapitalsAndCountries.isEmpty()) {
            allCapitalsAndCountries.put("Moscow", "Russia");
            allCapitalsAndCountries.put("Kiev", "Ukraine");
            allCapitalsAndCountries.put("Minsk", "Belarus");
            allCapitalsAndCountries.put("Beijing", "China");
            allCapitalsAndCountries.put("Seoul", "South Korea");
            allCapitalsAndCountries.put("Tokyo", "Japan");
            allCapitalsAndCountries.put("Bangkok", "Thailand");
            allCapitalsAndCountries.put("New Delhi", "India");
            allCapitalsAndCountries.put("Washington", "USA");
            allCapitalsAndCountries.put("Mexico City", "Mexico");
            allCapitalsAndCountries.put("Brasilia", "Brazil");
            allCapitalsAndCountries.put("Paris", "France");
            allCapitalsAndCountries.put("Berlin", "Germany");
            allCapitalsAndCountries.put("Madrid", "Spain");
            allCapitalsAndCountries.put("Oslo", "Norway");
            allCapitalsAndCountries.put("Stockholm", "Sweden");
            allCapitalsAndCountries.put("Tallinn", "Estonia");
            allCapitalsAndCountries.put("Helsinki", "Finland");
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public interface Delegate {
        String askQuestion(String country);
        void onEnd(int numberOfQuestions, int numberOfCorrectGuesses);
    }

}
