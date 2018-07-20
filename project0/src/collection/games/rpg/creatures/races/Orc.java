package collection.games.rpg.creatures.races;

public class Orc extends Race {

    @Override
    public void sayHello() {
        System.out.println("Gramdashbur!");
    }

    @Override
    public double getHealthCoefficient() {
        return 1.5;
    }
}
