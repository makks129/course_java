package collection.games.rpg.creatures.mosters;

public class Saruman extends Boss {

    public Saruman() {
        super("Saruman", 100, 1000, 50);
    }

    @Override
    public double getHealthCoefficient() {
        return 50;
    }

    @Override
    public int attack() {
        return 300;
    }
}
