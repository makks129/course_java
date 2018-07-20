### Homework

1. Create class Fan
    - Fields:
        - constants: SLOW, MEDIUM, FAST
        - speed (corresponds to one of the constants)
        - on
        - radius
        - color
        - fans[] (static array of all fans created)
    - Constructor(s)
    - Methods: 
        - accessors, mutators

2. Create class Rational
    - Fields:
        - numerator
        - denominator
    - Constructor(s)
    - Methods:
        - accessors, mutators
        - add(Rational r) -- return new Rational
        - subtract(Rational r) -- return new Rational
        - multiply(Rational r) -- return new Rational
        - divide(Rational r) -- return new Rational
        - doubleValue()

3. Create class GeoQuiz
   Create a class that represents a game where you are asked to name the capital of a country (or vice versa!), you can make a guess and after the game is finished the result is printed
    - Fields:
        - ALL_COUNTRIES[] (constant)
        - ALL_CAPITALS[] (constant)
        - countries[]
        - capitals[]
        - questionCount
        - guesses[] (array of boolean)
    - Constructor(s)
        - creates an object of GeoQuiz with N randomly selected countries and capitals
    - Methods:
        - hasNextQuestion()
        - getNextQuestion()
        - makeGuess(String guess)
        - printResults()