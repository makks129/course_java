package collection.games.rpg.creatures.mosters;

public class Sauron extends Boss {

    public Sauron() {
        super("Sauron", 1000, 10000, 500);
    }

    @Override
    public double getHealthCoefficient() {
        return 100;
    }

    @Override
    public int attack() {
        return 500;
    }
}
