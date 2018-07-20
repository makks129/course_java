package collection.games.rpg.creatures.races;

public class Human extends Race  {

    @Override
    public void sayHello() {
        System.out.println("Hello, friend!");
    }


    @Override
    public double getHealthCoefficient() {
        return 1.2;
    }
}
